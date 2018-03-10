package org.suchismita.ds;

public class QueueUsingArray<T> {
 private int front;
 private int rear;
 private T data[];	
 private int size = 10;
 
 public QueueUsingArray(){
	 this(10);
	 rear = -1;
	 front = -1;
	 
 }
 public QueueUsingArray(int size){
	 this.rear = -1;
	 this.front = -1;
	 this.size = size;
	 this.data = (T[])new Object[this.size];
 }
 private boolean isQueueFull(){
	 return this.rear == (this.size - 1);
 }
 public void insert(T data) throws Exception{
	 if(isQueueFull()){
		 throw new Exception("Queue overflowed.......");
	 }
	 else{
		 this.data[++this.rear] = data;
	 }
 }
 
 
 public T delete() throws Exception{
	 if(isQueueEmpty())
		 throw new Exception("Queue underflowed.....");
	 else{
		 return this.data[++this.front];
	 }
 }
private boolean isQueueEmpty() {
 return (this.front == this.rear);
}
 
 
 
 
}
