package javaexam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.print("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			
//			String의 비교에는 "==" 이 아니라 equals 메소드를 사용해야 된다.
//			name.equals("clear");
			if(name.equals("clear")) {
//				조건문안에 continue를 쓰면, continue 뒤의 내용을 실행하지 않고 반복문의 처음으로 돌아간다.
//				그래서 같은 if문 안에 continue뒤에 코드를 쓰면 Unreachable code 에러가 발생한다.
//				continue를 if문 맨마지막줄로 옮긴다.
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue;
			}
			
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				return;
			}
			
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다>");
			}
//			nameList에 입력한 name이 존재하지 않으면 nameList에 name을 add 해줘야 하는데 빠져있음.
//			nameList.add("name"); 이 추가되어야함
			else {
				nameList.add(name);
				System.out.println(name + " 추가 완료.");
			}
			
//			name이 이미 for문 밖에 선언되어 있기 때문에, 변수 이름 중복 에러가 나타납니다.
//			name을 다른 이름의 변수로 바꾸어 주어야한다.
//			name을 s로 바꾼다
			for(String s : nameList) {
				System.out.println(s);
			}
 		}
	}
}
