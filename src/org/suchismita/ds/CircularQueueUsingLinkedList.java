package org.suchismita.ds;

public class CircularQueueUsingLinkedList<T> {

	private CircularLinkedList<T> clist;
    
	public CircularQueueUsingLinkedList(){
		clist = new CircularLinkedList<T>();
	}
	
	public void add(T data){
		clist.addLast(data);
	}
	
	public T delete() throws Exception{
		if(clist.getTail() == null){
			throw new Exception("Queue underflow.............");
		}else{
			T data = clist.deleteFirst();
			return data;
		}
	}
	


}
