package com.bear.bean;

import com.bear.intf.Intf_Graph;
import com.bear.intf.Intf_GraphWriter;
import com.bear.intf.Intf_Node;

public class GraphWriter implements Intf_GraphWriter{

	@Override
	public void write(Intf_Graph graph, String address) {
		// TODO Auto-generated method stub
		//	the first node is ignored.
		boolean discardFirst = false;
		for(Intf_Node node:graph) {
			if(discardFirst) {
				System.out.println(node.getColor());
			}else {
				discardFirst = true;
			}
		}
		
	}

}
