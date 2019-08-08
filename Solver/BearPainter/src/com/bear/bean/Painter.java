package com.bear.bean;

import com.bear.intf.Intf_Graph;
import com.bear.intf.Intf_Painter;

public class Painter implements Intf_Painter{
	private Intf_Graph g;
	
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
			
			paint();
		}

	}

	
	
	
	
	private void clearMind() {
		
	}
	
	private void plan() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean isDown() {
		return true;
	}

	
	
	
	
	public Intf_Graph getG() {
		return g;
	}

	public void setG(Intf_Graph g) {
		this.g = g;
	}
	
	

}
