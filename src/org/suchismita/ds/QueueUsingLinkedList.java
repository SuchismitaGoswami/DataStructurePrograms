package org.suchismita.ds;

public class QueueUsingLinkedList<T> {

	private SingleLinkedList<T> list;
	private Node<T> rear ;
	private Node<T> front;
	
	public QueueUsingLinkedList() {
		list  = new SingleLinkedList<T>();
	    this.rear = this.front = null;
	}
	
	public void insert(T data){
		this.rear  = list.addLast(data);
		this.front = this.list.getHead();
	}
	
	public T delete() throws Exception{
		if(this.front == null){
			throw new Exception("No data");
		}else{
			T data = this.list.deleteFirst();
			this.front = this.list.getHead();
			return data;
		}
		
	}
	
	
}
