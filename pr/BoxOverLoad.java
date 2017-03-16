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
public class BoxOverLoad {
    
	double width,height,depth;

	public BoxOverLoad()	//Default Constructor
	{
	width=10;
	height=15;
	depth=20;
	}

	public BoxOverLoad(double val)	//Square Box
	{
	width=height=depth=(val>0)?val:1;
	}

	public BoxOverLoad(double w, double h, double d)	//UserDefined Box
	{
	width=(w>0)?w:1;
	height=(h>0)?h:1;
	depth=(d>0)?d:1;
	}

	public double volume()
	{
		return width*height*depth;
	}
}
    

