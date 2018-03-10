package org.suchismita.ds;

public class SingleLinkedList<T> {
	private Node<T> head;
	public SingleLinkedList(){
		this.head = null;
	}
	public void addFirst(T data){
		if(this.head == null)
		{
			this.head = new Node(data);
		}else{
			Node<T> newNode = new Node(data);
			newNode.setNext(this.head);
			this.head = newNode;
		}
		
	}
	
	public void addLast(T data){
		if(this.head == null){
			this.addFirst(data);
		}else{
			Node ref= this.head;
		  while(ref.getNext() != null){
			  ref = ref.getNext();
		  }
		  Node<T> newNode = new Node(data);
		  ref.setNext(newNode);
		}
	}
	
	
	public void addMiddle(int position,T data){
		if(position == 1){
			this.addFirst(data);
		}else{
			int index=1;Node ref=this.head;
			while(index<position){
				ref=ref.getNext();
			}
			if(ref !=null){
				Node<T> newNode = new Node(data);
				newNode.setNext(ref.getNext());
				ref.setNext(newNode);
			}
		}
	}
	
	public int deleteFirst() throws Exception{
		if(this.head != null){
			Node<T> ref = this.head;
			if(ref.getNext() != null){
			  int data = (Integer)this.head.getData();
			  this.head = this.head.getNext();
			  ref.setNext(null);
			  return data;
			}else{
				int data = (Integer)this.head.getData();
				this.head = null;
				return data;
				
			}
		}
		else{
			throw new Exception("NO data");
		}
	}
	
	public int deleteLast() throws Exception{
		
		if(this.head == null){
			throw new Exception("No data");
		}else{
			Node<T> slow = this.head;
			Node<T> fast = slow.getNext();
			while(fast.getNext() != null){
				slow = fast;
				fast = fast.getNext();
			}
			int data = (Integer)fast.getData();
			slow.setNext(null);
			return data;
		}
		
	}
	
	public int deleteMiddle(int position) throws Exception{
		if(this.head == null){
		  	throw new Exception("No data");
		}else{
			if(position == 1){
				return deleteFirst();
			}else{
			Node<T> slow = this.head;
			Node<T> fast = slow.getNext();
			int index = 1;
			while(index<(position-1)){
				slow = fast;
				fast = fast.getNext();
				index++;
			}
			int data = (Integer)fast.getData();
			slow.setNext(fast.getNext());
			fast.setNext(null);
			return data;
			}
			
		}
	}
 

}
