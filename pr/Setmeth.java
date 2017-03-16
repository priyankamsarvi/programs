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
public class Setmeth {
    
	public static void main(String arg[])
	{

	//creation of the object
	GetMeth obj=new GetMeth();

	//Initializing the object
	obj.setWidth(10);
	obj.setHeight(-15);
	obj.setDepth(20);

	double vol;
	vol=obj.volume();

	System.out.println("Volume of Box:"+vol);

	}

}
    

