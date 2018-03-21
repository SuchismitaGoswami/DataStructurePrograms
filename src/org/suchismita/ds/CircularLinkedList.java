package org.suchismita.ds;

public class CircularLinkedList<T> {
	private Node<T> tail;
	public CircularLinkedList(){
		this.tail = null;
	}
	
	public void addFirst(T data){
		if(this.tail == null){
			this.tail = new Node(data);
			this.tail.setNext(this.tail);
		}else{
			Node<T> ref = new Node(data);
			ref.setNext(tail.getNext());
			tail.setNext(ref);	
		}
	}
	
	public void addLast(T data){
		if(this.tail == null){
			this.addFirst(data);
		}else{
	     Node<T> ref = new Node(data);
	     ref.setNext(this.tail.getNext());
	     this.tail.setNext(ref);
	     this.tail = ref;
		}
	}
	
	public void addMiddle(int position,T data){
		if(position == 1){
			this.addFirst(data);
		}else{
			Node<T> newNode = new Node(data);
		    Node<T> slow = this.tail;
		    Node<T> fast = this.tail.getNext();
		    int index = 1;
		    while(index < position){
		      slow = fast;
		      fast = fast.getNext();
		      index ++;
		    }
		    newNode.setNext(fast);
		    slow.setNext(newNode);
		}
	}
     public T deleteFirst() throws Exception{
        if(this.tail == null){
        	throw new Exception("Empty list.......");
        }else{
        	Node<T> ref = this.tail.getNext();
        	this.tail.setNext(ref.getNext());
        	ref.setNext(null);
        	return ref.getData();
        }
     }
     
     public T deleteLast() throws Exception{
    	 if(this.tail == null){
         	throw new Exception("Empty list.......");
         }else{
        	 Node<T> ref = this.tail.getNext();
        	 while(ref.getNext() != this.tail){
        		 ref = ref.getNext();
        	 }
        	 Node<T> nodeToDelete = this.tail;
        	 this.tail = ref;
        	 this.tail.setNext((nodeToDelete.getNext()));
        	 nodeToDelete.setNext(null);
        	 return nodeToDelete.getData();
         }
     }
     
     
     public T deleteFromMiddle(int position,T data) throws Exception{
    	 if(position == 1){
    		 return this.deleteFirst();
    	 }else{
    		 int index = 1;
    		 Node<T> slow = this.tail;
    		 Node<T> fast = this.tail.getNext();
    		 while(index < position){
    			 slow = fast;
    			 fast = fast.getNext();
    			 index ++;
    		 }
    		 slow.setNext(fast.getNext());
    		 fast.setNext(null);
    		 return fast.getData();
    	 }
     }
		
     public boolean searchElement(T data) throws Exception{
    	  if(this.tail == null){
          	throw new Exception("Empty list.......");
          }else{
    	 Node<T> ref = this.tail;
    	 while(ref.getNext() == this.tail){
    		 if(ref.getData() == data){
    			 return true;
    		 }
    		 ref = ref.getNext();
    	 }
    	 return false;
         }
     }
     
    public void reverseList() throws Exception{
    	  if(this.tail == null){
            	throw new Exception("Empty list.......");
            }else{
            Node<T> ref = this.tail;
            Node<T> ref1 = ref.getNext();
            Node<T>  ref2 = ref1.getNext();
            while(ref1 != this.tail){
            	ref1.setNext(ref);
            	ref = ref1;
            	ref1 = ref2;
            	ref2.setNext(ref1);
            }
            this.tail = ref2;
            ref1.setNext(ref);  
            
          }
    }

	public Node<T> getTail() {
		return tail;
	}

     
	}


