package com.stack;

public class Block
{
	private int data;
	private Block next;
	
	public Block(int data)
	{
		this.data = data;
		next = null;
	}
	
	public int getData() 
	{
		return data;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public Block getNext() 
	{
		return next;
	}
	public void setNext(Block next)
	{
		this.next = next;
	}

	@Override
	public String toString()
	{
		return String.valueOf(data);
	}
	
	
	
	
}
