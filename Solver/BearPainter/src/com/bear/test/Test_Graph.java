package com.bear.test;

import com.bear.bean.Graph;
import com.bear.intf.Intf_Node;

public class Test_Graph {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.link(1, 2);
		g.link(2, 1);
		
		for(Intf_Node node:g) {
			System.out.println(node);
		}
	}
}
