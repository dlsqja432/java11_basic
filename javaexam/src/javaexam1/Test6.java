package javaexam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("추가할 음식 입력 : ");
				String name = sc.next();
				System.out.print("칼로리 입력 : ");
				int kcal = sc.nextInt();
				System.out.println("음식 정보가 추가 되었습니다.");
				fList.add(new Food(name, kcal));
			}
			if(num == 2) {
				if(fList.isEmpty()) {
					System.out.println("리스트가 비었습니다.");
				}
				else {
					for(Food f : fList) {
						System.out.println(f.toString());
					}
				}
			}
			if(num == 3) {
				System.out.print("삭제하고 싶은 음식 선택 : ");
				String s = sc.next();
				for(int i=0; i<fList.size(); i++) {
					if(fList.get(i).getName().equals(s)) {
						System.out.println(fList.get(i).toString() + "가 삭제되었습니다.");
						fList.remove(i);
					}
				}
			}
			if(num == 4) {
				System.out.println("프로그램이 종료되었습니다.");
				sc.close();
				break;
			}
			System.out.println();
		}
	}
}
