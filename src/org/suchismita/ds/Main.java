package org.suchismita.ds;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   StackUsingArray<Integer> stack = new StackUsingArray<Integer>(5);
   stack.push(10);
   stack.push(12);
   stack.push(13);
   stack.push(15);
   System.out.println(stack.pop());
   System.out.println(stack.pop());
   System.out.println(stack.pop());
   System.out.println(stack.pop());
   System.out.println(stack.pop());
   
	}

}
