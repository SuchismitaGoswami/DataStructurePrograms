package org.suchismita.ds;

public class StackUsingArray<T> {
private T data[];
private int top;
private int size = 10;
public StackUsingArray(){
	this(10);
}

@SuppressWarnings("unchecked")
public StackUsingArray(int size){
	this.size = size;
	this.data = (T[])(new Object[size]);
	this.top = -1;
}
	
private boolean isStackEmpty(){
	return (this.top == -1);
	
}

private boolean isStackFull(){
	return (this.top == (this.size-1));
}

public void push(T data) throws Exception{
	if(isStackFull()){
		throw new Exception("Stack overflowed.......");
	}
	this.data[++(this.top)] = data;
}

public T pop() throws Exception{
	if(this.isStackEmpty()){
		throw new Exception("Stack underflowed ......");
	}
	return this.data[this.top--];
}

	
	
}
