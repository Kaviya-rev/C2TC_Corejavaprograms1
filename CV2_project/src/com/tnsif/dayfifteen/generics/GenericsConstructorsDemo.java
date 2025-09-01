package com.tnsif.dayfifteen.generics;

public class GenericsConstructorsDemo {

	public static void main(String[] args) {
		System.out.println("Number to Double Conversion:");
		  
		  GenericsConstructors obj=new GenericsConstructors(10);
		  obj.show();
		  
		  GenericsConstructors objOne=new GenericsConstructors(136.8F);
		  objOne.show();
		  
			/*
			 * GenericConstructors objTwo=new GenericConstructors("Hello")); objTwo.show();
			 */
	}

}