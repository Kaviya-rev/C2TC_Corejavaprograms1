package com.tnsif.daynineteen;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());

	}

}
