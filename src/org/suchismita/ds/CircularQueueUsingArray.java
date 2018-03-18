package org.suchismita.ds;

public class CircularQueueUsingArray<T> {

	private T data[];
	private int rear;
	private int front;
	private int size;
	public CircularQueueUsingArray(){
		this(10);
	}
	
	public CircularQueueUsingArray(int size){
		this.data = (T[])(new Object[size]);
		this.size = size;
		this.rear = this.size - 1;
		this.front = this.size - 1;
		
	}
	private boolean isQueueFull(){
		return (((this.rear + 1)%this.size ) == this.front);
	}
	
	
	public void addQueue(T data) throws Exception{
		if(isQueueFull()){
			throw new Exception("overflow condition occured......");
		}
		else{
			this.rear = ((this.rear+1)%this.size);
			this.data[this.rear] = data;
		}	
	}
    private boolean isQueueEmpty(){
    	return (this.front == this.rear);
    }
	public T deleteQueue() throws Exception{
		if(this.isQueueEmpty()){
			throw new Exception("underflow condition occured.......");
		}
		else{
			this.front = (this.front + 1)%this.size;
			T data = this.data[this.front];
			return data;
		}
	}
	
}
