package org.suchismita.ds;

public class LinkedList<T> {
	private Node<T> rear;
	private Node<T> front;
	
	
	 public LinkedList() {
		// TODO Auto-generated constructor stub
		 this.rear = null;
		 this.front = null;
	}
	 
	 public Node<T> getFront() {
		return front;
	}

	public void setFront(Node<T> front) {
		this.front = front;
	}

	public void add(T data){
	    if(this.rear == null){
	    	this.rear = new Node<T>(data);
	    	this.front =this.rear;
	    }else{
	    	Node<T> newNode = new Node<T>(data);
	    	this.rear.setNext(newNode);
	    } 	
	  }	
	
	public T delete(){
	 Node<T> ref = this.front;
	 this.front = this.front.getNext();
	 ref.setNext(null);
	 return ref.getData();
	}
	
	
	

}


