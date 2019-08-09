package com.bear.bean;

import java.util.ArrayList;
import java.util.Iterator;

import com.bear.intf.Intf_Graph;
import com.bear.intf.Intf_Node;

public class Graph implements Intf_Graph{
	private ArrayList<Intf_Node> graph = new ArrayList<Intf_Node>();
	@Override
	public Iterator<Intf_Node> iterator() {
		// TODO Auto-generated method stub
		return graph.iterator();
	}

	@Override
	public void link(int node1, int node2) {
		// TODO Auto-generated method stub
		Intf_Node nodeA = select(node1);
		nodeA.link(node2);
	}

	@Override
	public void release(int node1, int node2) {
		// TODO Auto-generated method stub
		Intf_Node nodeA = select(node1);
		nodeA.release(node2);
	}

	@Override
	public Intf_Node select(int index) {
		// TODO Auto-generated method stub
		if(index >= graph.size()) {
			graph.add(new Node());
			return select(index);
		}
		return graph.get(index);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(Intf_Node node:this.graph) {
			System.out.println(node.getColor());
		}
	}
	
}
