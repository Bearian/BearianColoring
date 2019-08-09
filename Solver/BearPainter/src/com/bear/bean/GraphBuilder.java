package com.bear.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import com.bear.intf.Intf_Graph;
import com.bear.intf.Intf_GraphBuilder;

public class GraphBuilder implements Intf_GraphBuilder {
	@Override
	public Intf_Graph readNbuild(String address){
		// TODO Auto-generated method stub
		Graph g = new Graph();
		File f = new File(address);
		try {
			InputStream in = new FileInputStream(f);
			Scanner s = new Scanner(in);
			connects(g,s);
			s.close();
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return g;
	}
	
	public void connects(Intf_Graph graph, Scanner info) {
		if(info.hasNext()) {
			char first = info.next().charAt(0);
			if(first == 'e') {
				int node1 = info.nextInt();
				int node2 = info.nextInt();
//				System.out.println(node1);
			//undirected
				graph.link(node1, node2);
				graph.link(node2, node1);
			}else {
				info.nextLine();
			}
			connects(graph,info);
		}
	}
	
	

}
