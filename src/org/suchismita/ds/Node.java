package org.suchismita.ds;

public class Node<T> {
private T data;
private Node next;	

public Node(T data){
  this.data  = data;
  this.next = null;
}

public T getData(){
	return this.data;
}

public void setData(T data){
	this.data = data;
}

public Node getNext(){
	return this.next;
}

public void setNext(Node nextNode){
	this.next = nextNode;
}
}
