package exam01;

import java.util.Scanner;

public class CalorieExam {

	public static void main(String[] args) {
		int calorie, protein, carbohydrate, fat;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단백질 : " );
		protein = scan.nextInt();
		System.out.print("탄수화물 : ");
		carbohydrate = scan.nextInt();
		System.out.print("지방 : ");
		fat = scan.nextInt();
		System.out.println("칼로리 : " + (protein*4 + carbohydrate*4 + fat*9));
	}

}
