package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {

			FieldTest2 f2 = new FieldTest2();
			// > import 또한 안해도 됨(같은 패키지 이기 때문에)
			
			
			// public
			System.out.println(f2.pub);
			
			// protected
			System.out.println(f2.pro);
		
			// default
			System.out.println(f2.df);
			
			// private
			// System.out.println(f2.pri); // is not visible
			
			
	}

}
