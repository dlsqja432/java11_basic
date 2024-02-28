package exam03;

import java.util.Scanner;

public class BoardExam {

	public static void main(String[] args) {
		Board[] bArr = new Board[6];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<bArr.length; i++) {
			bArr[i] = new Board();
			bArr[i].setBno(i);
			bArr[i].setTitle(i+"제목");
			bArr[i].setUname(i+"유저이름");
			bArr[i].setContent(i+"내용");
			bArr[i].setResdate(i+"작성일");
			bArr[i].setVisited(i);
			System.out.println(bArr[i].toString());
		}
	}

}
