package org.kh.object1;

//객체(Object) : 필요에 따라서 클래스로 부터 객체를 생성하여 활용한다.
//사람		=> 클래스
//		   속성(멤버변수) : name, year, job, gender
//		   활동(메소드): running, eating
//김기태 	=> 객체(인스턴스)
//		   name : 장인범
//		   year : 1996
//		   job 	: student
//		   gender : male
//		   장인범 running
//		   
//
//클래스 : 멤버 변수(필드 = 속성) : 필요에 따라 여러 속성을 기재
//	   메서드(Method) : 사용자 정의 메소드, getter, setter 등
//	   생성자 함수(Constructer - 객체 생성) : 클래스 이름과 같아야 함

//접근제어자 class 클래스명 {
//	접근제어자 [지시자] 타입 필드명;
//	접근제어자 생성자함수() { 객체생성코드; }
//	접근제어자 [지시자] 반환타입 메소드명([매개변수]) { 처리문장; } 
//}

//객체 생성시
//	클래스명 인스턴스명 = new 생성자함수();

public class Person {
	String name;
	int year;
	String gender;
	String job;
	
	void running() {
		System.out.println(this.name + "이 달립니다.");
	}
}




























