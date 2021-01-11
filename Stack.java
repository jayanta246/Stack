package com.stack;
public class Stack 
{
	private Block top=null;
	private int size=0;
	
	public void push(int data)
	{
		Block block=new Block(data);
		Block temp=top;
		top=block;
		top.setNext(temp);
		size++;
	}
	
	
	public Block pop()
	{
		if(top==null)
		{
			System.out.println("Empty");
		}
		
			Block temp=top;
			top.getData();
			top=top.getNext();
			size--;
			return temp;
	}
	
	
	public void peek()
	{
		System.out.println("Top element is "+ top);
	}
	
	
	public int size()
	{
		return size;
		
	}
	
	
	public void print()
	{
		if(top==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Block temp=top;
			while(temp!=null)
			{
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
		}
	}
	
}
