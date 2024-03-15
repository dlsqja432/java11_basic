package javaexam1;

class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setNo(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Test4 {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
//		비어있거나 초기화 되어 있지 않은 pArr 배열에 Person 객체를 생성하여 각 요소에 생성된 객체을 대입
//		for(int i=0; i<pArr.length; i++) {
//			pArr[i] = new Person(i, "이름"+i);
//		}
		
//		실제 선언한 배열의 개수보다 더 많은 수의 반복 실행이 된다.
//		배열의 마지막 index는 배열의 길이-1 인데, 지금 배열의 마지막 index보다 1초과한 index까지 접근하기 때문에
//		ArrayIndexOutOfBoundsException이 발생한다.
		for(int i=0; i<=pArr.length; i++) {
//			Person 의 배열 요소인 pArr 객체가 초기화가 안되어있어서 NullPointerException 발생
			System.out.println(pArr[i].getName());
		}
	}
}
