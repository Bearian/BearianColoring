package com.bear.test;

import com.bear.bean.Node;

public class Test_Node {
	public static void main(String[] args) {
		Node n = new Node();
		n.link(1);
		n.inhibit(2);
		System.out.println(n);
	}
}
