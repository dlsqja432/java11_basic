package sec2;

import java.util.Scanner;

public class BookExam {

	public static void main(String[] args) {
		// 100개의 Book 배열 선언
		Book[] book = new Book[100];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			book[i] = new Book("책제목"+(i+1),"저자"+(i+1));
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(book[i].toString());
		}
	}

}
