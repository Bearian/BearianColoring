package com.bear.intf;

public interface Intf_Node extends Iterable<Integer>{
	public void link(int index);
	public void release(int index);
	
	public void inhibit(int index);
	public int getColor();
}
