package com.bear.test;

import com.bear.bean.GraphBuilder;
import com.bear.bean.GraphWriter;
import com.bear.bean.Painter;
import com.bear.intf.Intf_Graph;
import com.bear.intf.Intf_Painter;

public class Test_Painter {
	public static void main(String[] args) {
	//Fixation	
		//generate test graph
		String in1 = "examples/DSJC250.5.col";
		String in = "examples/marco10.col";
		String in0 = "examples/test.col";
		String out = "examples/test.sol";
		GraphBuilder gb = new GraphBuilder();
		GraphWriter gw = new GraphWriter();
		Intf_Graph g = gb.readNbuild(in0);
		

		//generate test painter 
		Intf_Painter p = new Painter();
		p.setUpCanvas(g);
		
	//asset
		p.paint();
		Intf_Graph p2 = p.getProduct();
		
	//examine 
		
		gw.write(g, out);
	
	//destroy
	}
}
