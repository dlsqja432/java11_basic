package javaexam1;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	private String name;
	private String color;
	
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class Test5 {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
//		list(ArrayList)는 제네릭타입이 Fruit로 설정되어 있으므로 Fruit로 객체를 생성하여 요소를 추가해야 하는데
//		String 타입을 추가하려고 하여 type mismatch 에러발생
//		list.add("바나나");
		
//		list는 ArrayList 컬렉슨 프레임워크는 length 속성이 없어 요소의 수를 구하려면 size() 메소드를 사용해야함
//		Not Found Attribute(속성) Error 발생
		for(int i=0; i<list.size(); i++) {
//			list[i]는 배열에서의 index에 따른 값을 불러올때 사용 하는 방식이고, ArrayList에서는
//			get() 메소드를 사용해서 list의 값을 불러와야한다.
//			Not Allowed Operation(Operation Not Permmitted Error 발생
			System.out.println(list.get(i).getName());
		}
	}
}
