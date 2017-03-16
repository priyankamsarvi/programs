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
public class Employee {
 int empid;
String empname,email;

public Employee()
{
 System.out.println("Super Class Constructor");
 empid=1001;
 empname="Sunita";
 email="sunita@gmail.com";
}
public void display()
{
System.out.println("Employee ID:"+empid);
System.out.println("Employee Name:"+empname);
System.out.println("Employee Email:"+email);
}
   
}
