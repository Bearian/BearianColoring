package com.bear.bean;

import java.util.ArrayList;
import java.util.HashMap;

import com.bear.intf.Intf_Graph;
import com.bear.intf.Intf_Node;
import com.bear.intf.Intf_Painter;

public class Painter implements Intf_Painter{
	private Intf_Graph g;
	private HashMap<Integer,Intf_Node> loads = 
			new HashMap<Integer,Intf_Node>();
			
	private ArrayList<Integer> sequence = 
			new ArrayList<Integer>();
	
	
	@Override
	public void setUpCanvas(Intf_Graph g) {
		// TODO Auto-generated method stub
		setG(g);
		clearMind();	
		plan();
	}

	@Override
	public Intf_Graph getProduct() {
		// TODO Auto-generated method stub
		return getG();
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		if(!isDown()) {
			stroke();
			paint();
		}

	}

	
	private void stroke() {
		if(sequence.isEmpty()) {
			int key = getStart();
			sequence.add(key);
		}
		
		int head = sequence.get(0);
		sequence.remove(0);
		
		paint(head);
	}
	
	private void paint(int index) {
		
		// TODO Auto-generated method stub
		Intf_Node node = loads.get(index);
		// add color
		int color = node.getColor();
		// remove node
		loads.remove(index);
		// select next nodes
		for(int nextKid:node) {
			if(loads.containsKey(nextKid)) {
				Intf_Node kid = loads.get(nextKid);
				// inhibit them
				kid.inhibit(color);
				// add them into sequence
				if(!sequence.contains(nextKid)) {
					sequence.add(nextKid);
				}
			}
		}
			
	}

	private Integer getStart() {
		for(int key:loads.keySet()) {
			return key;
		}
		return null;
	}
	
	
	
	
	
	
	private void clearMind() {
		loads.clear();
		sequence.clear();
	}
	
	private void plan() {
		// TODO Auto-generated method stub
		int counter = 0;
		for(Intf_Node node:g) {
			//because the coloring number starts with 1
			if(counter != 0) {
				loads.put(counter, node);
			}
			counter = counter + 1;
			
		}
	}
	
	private boolean isDown() {
		return loads.isEmpty();
	}

	
	
	
	
	public Intf_Graph getG() {
		return g;
	}

	public void setG(Intf_Graph g) {
		this.g = g;
	}
	
	

}
