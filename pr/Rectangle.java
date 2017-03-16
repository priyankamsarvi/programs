/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.pr;

/**
 *
 * @author Priyanka
 */
public class Rectangle extends Shape{
    
	public Rectangle(double d1,double d2)
	{
	super(d1,d2);	
	}
	public double area()
	{
	return dim1*dim2;
	}
    
}
