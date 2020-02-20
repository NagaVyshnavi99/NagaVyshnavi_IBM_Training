
package com;

public class StaticBlock {
	static //static block should always be above main method.static block has higher priority than main method.
	{
		System.out.println("JAVA");
	}
  public static void main(String args[])
  {
	  System.out.println("Hello");
  }
}
