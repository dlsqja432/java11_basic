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
			
//			String의 비교에 "==" 사용 시 정상출력 되지 않는다.
//			equals() 메소드를 사용해야 된다.
//			name.equals("clear");
			if(name.equals("clear")) {
//				continue 구문이 실행해야 할 다른 문장보다 앞서 있어서 continue 구문 이후의 문장이 실행되지 못함.
//				continue를 if문 맨마지막줄로 옮긴다.
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue;
			}
			
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				// exit가 입력될 경우 아래 반복출력 문장을 실행하지 못하고, main 함수(메소드)의 밖으로 탈출해버린다.
				// return을 break로 바꿔야함.
				break;
			}
			
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다>");
			}
			
			else {
//				이름목록(nameList)에 이름을 추가하는 구현 코드의 누락으로 인해 추가하지 못함.
//				nameList.add("name"); 이 추가되어야함
				nameList.add(name);
				System.out.println(name + " 추가 완료.");
			}
 		}

		for(String name : nameList) {
			System.out.println(name);
		}
	}
}
