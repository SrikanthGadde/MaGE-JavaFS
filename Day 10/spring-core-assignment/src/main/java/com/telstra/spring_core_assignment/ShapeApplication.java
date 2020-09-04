package com.telstra.spring_core_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telstra.spring_core_assignment.models.Line;
import com.telstra.spring_core_assignment.models.Point;
import com.telstra.spring_core_assignment.models.Triangle;

public class ShapeApplication 
{
    public static void main( String[] args )
    {
    	//Instance of Point bean from  IoC container 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Point p1 = (Point) context.getBean("point1");
    	System.out.println("The x co-ordinate of the point is: "+p1.getX());
    	System.out.println("The y co-ordinate of the point is: "+p1.getY());
    	
    	//Instance of Line bean from  IoC container 
    	Line l1 = (Line) context.getBean("line1");
    	System.out.println("Points of the line are: ");
    	System.out.println(l1.getP1());
    	System.out.println(l1.getP2());
    	
    	//Instance of Triangle bean from  IoC container 
    	Triangle t1 = (Triangle) context.getBean("triangle1");
    	System.out.println("Points of the triangle are: ");
    	System.out.println(t1.getP1());
    	System.out.println(t1.getP2());
    	System.out.println(t1.getP3());
    }
}
