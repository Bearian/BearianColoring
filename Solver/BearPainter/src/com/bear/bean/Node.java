package com.bear.bean;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import com.bear.intf.Intf_Node;

public class Node implements Intf_Node{
	private int color = 0;
	
	private LinkedList<Integer> links = new LinkedList<Integer>();
	private LinkedList<Integer> inhibits = new LinkedList<Integer>();
	
	@Override
	public void link(int index) {
		// TODO Auto-generated method stub
		links.add(index);
	}

	@Override
	public void release(int index) {
		// TODO Auto-generated method stub
		links.remove(index);
	}

	@Override
	public void inhibit(int index) {
		// TODO Auto-generated method stub
		inhibits.add(index);
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		if(this.color == 0) {
			color = getColor(1);
			setColor(color);
		}
		return this.color;
	}
	
	private void setColor(int color) {
		this.color = color;
	}
	
	private int getColor(int start) {
		if(inhibits.contains(start)) {
			return getColor(start+1);
		}else {
			return start;
		}
	}
	
	
	
	
	
	
	public String toString() {
		String rs = "";
		rs = rs + linkInfo();
		rs = rs + inhibitInfo();
		return rs;
	}
	
	private String inhibitInfo() {
		// TODO Auto-generated method stub
		String rs = "cannot be\n";
		for(int index:this.inhibits) {
			rs = rs + index + " "; 			
		}
		rs = rs + "\n";
		return rs;
	}

	private String linkInfo() {
		String rs ="links to\n";
		for(int index:this.links) {
			rs = rs + index + " "; 
		}
		rs = rs + "\n";
		return rs;
	}

	
	
	
	
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return this.links.iterator();
	}
}
