package com.nt.test;

import java.util.Date;

import com.nt.beans.Utility;

public class Test1 {
	
	public static void main(String[] args) {
		Utility util=null;
		util=new Utility();
		Date d=util.getDate();
		System.out.println(d);
		util.m1();
		
	}
	
}
