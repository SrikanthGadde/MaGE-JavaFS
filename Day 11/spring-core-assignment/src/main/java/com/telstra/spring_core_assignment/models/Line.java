package com.telstra.spring_core_assignment.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Line {
	private Point p1;
	private Point p2;
	
	public Point getP1() {
		return p1;
	}
	
	@Autowired
	@Qualifier("point2")
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	
	@Autowired
	@Qualifier("point3")
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	
	
}
