package com.tnsif.dayfifteen.generics;

public class GenericsConstructors {
	private double v;

	//Generic Constructors
	public <T extends Number>GenericsConstructors(T t)
	{
		v=t.doubleValue();
	}
	void show()
	{
		System.out.println("Value of v in double type is: "+v);
	}
}