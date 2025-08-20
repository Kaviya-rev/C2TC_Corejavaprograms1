package com.tnsif.abstraction_example;

public class TechTrainer extends Trainer {

	@Override
	public void session() 
	{
		System.out.println("Core java session is going on");
	}
	@Override
	public void checks()
	{
		System.out.println("Assingments given from Inheritance");
	}
}