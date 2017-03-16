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
public class GetMeth {
    private double width,height,depth;

	//getter Methods

	public double getWidth()
	{
	return width;
	}
	public double getHeight()
	{
	return height;
	}
	public double getDepth()
	{
	return depth;
	}

	//setter Methods

	public void setWidth(double w)
	{
	width=(w>0)?w:1;
	}

	public void setHeight(double h)
	{
	height=(h>0)?h:1;
	}

	public void setDepth(double d)
	{
	depth=(d>0)?d:1;
	}
	
	//Object Manipulation Method
	public double volume()
	{
	return width*height*depth;
	}
	
    
}
