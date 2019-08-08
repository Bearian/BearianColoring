package com.bear.intf;

public interface Intf_Graph extends Iterable<Intf_Node>{
	public void link(int node1,int node2);
	public void release(int node1,int node2);
	public Intf_Node select(int index);
	
}
