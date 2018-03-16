package org.suchismita.ds;

public class StackUsingLinkedList<T> {

	SingleLinkedList<T> list = null;
	private Node<T> top = null;
	
	public StackUsingLinkedList() {
		// TODO Auto-generated constructor stub
	 list = new SingleLinkedList<T>();
	 this.top = list.getHead();
	}
	
	public void push(T data){
		list.addFirst(data);
		this.top = list.getHead();
	}
	
	public T pop() throws Exception{
		if(this.top == null){
			throw new Exception("No data");
		}else{
		   T data = this.list.deleteFirst(); 	
		   this.top = this.list.getHead();
		   return data;
		}
	}
}
