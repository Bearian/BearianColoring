package com.bear.test;

import com.bear.bean.GraphBuilder;

public class Test_GraphBuilder {
	public static void main(String[] args) {
		GraphBuilder bg = new GraphBuilder();
		bg.readNbuild("examples/marco10.col");
	}
}
