package org.suchismita.ds;

public class NodeForDoubleList<T> {
private T data;
private NodeForDoubleList<T> next;
private NodeForDoubleList<T> prev;


public NodeForDoubleList(T data) {
	// TODO Auto-generated constructor stub
	this.data = data;
	this.next = null;
	this.prev = null;
}


public T getData() {
	return data;
}


public void setData(T data) {
	this.data = data;
}


public NodeForDoubleList<T> getNext() {
	return next;
}


public void setNext(NodeForDoubleList<T> next) {
	this.next = next;
}


public NodeForDoubleList<T> getPrev() {
	return prev;
}


public void setPrev(NodeForDoubleList<T> prev) {
	this.prev = prev;
}




}
