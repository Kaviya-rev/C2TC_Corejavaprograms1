//multiple inheritance - 
package com.tnsif.dayeight.Interface.extendingInterface;

public class ExtentionInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}