package com.stack;

public class MainStack 
{

	public static void main(String[] args)
	{
		Stack stack=new Stack();
		stack.push(20);
		stack.push(10);
		stack.push(30);
		stack.push(80);
		stack.pop();
		System.out.println(stack.size());
		stack.peek();
		stack.print();

	}

}
