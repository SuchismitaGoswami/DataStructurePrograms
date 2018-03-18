package org.suchismita.ds;

public class QueueUsingLinkedList<T> {

	private LinkedList<T> list;
	
	public QueueUsingLinkedList() {
		// TODO Auto-generated constructor stub
     list = new LinkedList<T>();
	}
	
	public void addQueue(T data){
		list.add(data);
	}
	
	public boolean isQueueEmpty(){
		return (this.list.getFront() == null);
	}
	public T delete() throws Exception{
		if(this.isQueueEmpty()){
			throw new Exception("No data");
		}else{
			return this.list.delete();
		}
		
	}
	
	
}
