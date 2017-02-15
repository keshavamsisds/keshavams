/* Concatenate tow input strings */
package com.myjava.string;
public class StringConcat
{
	public static void main(String a[])
		{
			String b = "Ramu Weds";
			String c= "Lakshmi";
			
			String d = b+c;
			System.out.println(d);
			
			d = b.concat(c);
			System.out.println(d);
		}
}