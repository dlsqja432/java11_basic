package org.kh.object1;

public class PersonEx1 {

	public static void main(String[] args) {

		Person jang = new Person();
		jang.name = "장인범";
		jang.year = 1996;
		jang.gender = "남성";
		jang.job = "Student";
		jang.running();
		
		Person lee = new Person();
		lee.running();
	}

}
