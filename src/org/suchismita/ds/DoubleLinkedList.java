package org.suchismita.ds;

public class DoubleLinkedList<T> {
	private NodeForDoubleList<T> head;
	
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}
	
	public void addFirst(T data){
	 if(this.head == null){
		 NodeForDoubleList<T> newNode = new NodeForDoubleList(data);
		 this.head = newNode;
	 }else{
		 NodeForDoubleList<T> newNode = new NodeForDoubleList(data);
		 newNode.setNext(this.head);
		 this.head = newNode;
	 }
	}
	
	
	public void addLast(T data){
		if(this.head == null){
			this.addFirst(data);
		}else{
		
		NodeForDoubleList<T> ref = this.head;
		while(ref.getNext() != null){
			ref = ref.getNext();
		}
		NodeForDoubleList<T> newNode = new NodeForDoubleList(data);
		ref.setNext(newNode);
		newNode.setPrev(ref);
		}
	}
	
	public void addMiddle(int position,T data){
		if(position == 1){
			this.addFirst(data);
		}else{
		NodeForDoubleList<T> slow = this.head;
		NodeForDoubleList<T> fast = slow.getNext();
		int index = 1;
		while(index < position-1){
			slow = fast;
			fast = fast.getNext();
			index++;
		}
		NodeForDoubleList<T> newNode = new NodeForDoubleList(data);
		newNode.setNext(fast);
		newNode.setPrev(slow);
		fast.setPrev(newNode);
		slow.setNext(newNode);
		}
	}
	
	public T deleteFirst() throws Exception{
	 if(this.head == null){
		 throw new Exception("No data found");
	 }else{
		 NodeForDoubleList<T> nodeRef = this.head;
		 this.head = nodeRef.getNext();
		 T data = nodeRef.getData();
		 nodeRef.setNext(null);
		 nodeRef.setPrev(null);
		 return data;
	 }
	}
	 public T deleteLast() throws Exception{
		if(this.head == null){
			throw new Exception("No data found");
		}else{
			NodeForDoubleList<T> ref = this.head;
			while(ref.getNext() != null){
				ref = ref.getNext();
			}
			NodeForDoubleList<T> slow = ref.getPrev();
			T data = ref.getData();
			slow.setNext(null);
			ref.setNext(null);
			ref.setPrev(null);
			return data;
		}
		
	 }
	 
	 
	 public T deleteMiddle(int position,T data) throws Exception{
		 if(position == 1){
			 return deleteFirst();
		 }else{
			 int index = 1;
			 NodeForDoubleList<T> ref = this.head;
			 while(index <position){
				 ref = ref.getNext();
				 index++;
			 }
			 NodeForDoubleList<T> prev = ref.getPrev();
			 NodeForDoubleList<T> next = ref.getNext();
			 prev.setNext(next);
			 next.setPrev(prev);
			 ref.setNext(null);
			 ref.setPrev(null);
			 return ref.getData();
		 }
		 
	 }
	 
	 public void printList(){
		 NodeForDoubleList<T> ref =  this.head;
		 while(ref != null){
			 System.out.println(ref.getData());
			 ref = ref.getNext();
		 }
	 }
	
	 public void reversePrint() throws Exception{
		 NodeForDoubleList<T> ref = this.head;
		 if(ref == null){
			 throw new Exception("List is empty....");
		 }else{
			 while(ref.getNext() != null){
				 ref = ref.getNext();
			 }
			 while(ref != null){
			 System.out.println(ref.getData());
			 ref = ref.getPrev();
			 }
		 }
		 
	 }
	
	 public boolean search(T data) throws Exception{
		 if(this.head == null){
			throw new Exception("List is empty......");
		 }else{
			 NodeForDoubleList<T> ref = this.head;
			 while(ref != null){
				 if(ref.getData() == data){
					 return true;
				 }
				 ref = ref.getNext();
			 }
		 }
		 return false;
	 }

}
