package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {

		String name = "장인범";
		Integer age = 29;
		String age2 = "43";
		int age3 = Integer.parseInt(age2) + 8;
		Float height = 173.6f;
		String height2 = "173.6";
		float height3 = Float.parseFloat(height2);
//		boolean pass = true;
		Double weight = 72.3;
		
		System.out.println("name : " + name.getClass().getName());
		System.out.println("age : " + age.getClass().getName());
		System.out.println("float : " + height.getClass().getName());
		System.out.println("weight : " + weight.getClass().getName());
		System.out.println(age3);
		System.out.println(height3);
		// primitive type => Wrapper type = boxing
		// Wrapper type => primitive type = unboxing
	}

}
