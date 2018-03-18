package org.suchismita.ds;

public class SingleLinkedList<T> {
	private Node<T> head;
	
	public SingleLinkedList(){
		this.head = null;
	}
	
	public Node<T> getHead() {
		return head;
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
	
	public T deleteFirst() throws Exception{
		if(this.head != null){
			Node<T> ref = this.head;
			if(ref.getNext() != null){
			  T data = this.head.getData();
			  this.head = this.head.getNext();
			  ref.setNext(null);
			  return data;
			}else{
				T data = this.head.getData();
				this.head = null;
				return data;
				
			}
		}
		else{
			throw new Exception("NO data");
		}
	}
	
	public T deleteLast() throws Exception{
		
		if(this.head == null){
			throw new Exception("No data");
		}else{
			Node<T> slow = this.head;
			Node<T> fast = slow.getNext();
			while(fast.getNext() != null){
				slow = fast;
				fast = fast.getNext();
			}
			T data = fast.getData();
			slow.setNext(null);
			return data;
		}
		
	}
	
	public T deleteMiddle(int position) throws Exception{
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
			T data = fast.getData();
			slow.setNext(fast.getNext());
			fast.setNext(null);
			return data;
			}
			
		}
	}
	
	public boolean searchElement(T searchData){
		Node<T> ref = this.head;
		while(ref != null){
			if(ref.getData() == searchData){
				return true;
			}
			ref = ref.getNext();
		}
		return false;
	}
	
	public void reverseLinkedList(){
		Node<T> p = this.head.getNext();
		Node<T> q = this.head;
		Node<T> r = null;
		while(p != null ){
			q.setNext(r);
			r=q;
			q=p;
			p=p.getNext();
		}
		q.setNext(r);
		this.head = q;
	}
	
	
	public void destroyLinedList() throws Exception{
		Node<T> ref = this.head;
		int index = 1;
		while(ref != null){
			deleteMiddle(index);
			index++;
			ref = ref.getNext();
		}	
	}
	
	public void dispalyList(){
		Node<T> ref = this.head;
		while(ref != null){
			System.out.println(ref.getData());
			ref = ref.getNext();
		}
	}
}
