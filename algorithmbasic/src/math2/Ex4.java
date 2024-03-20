package math2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		
		// 0일 경우 처리
		if(s.equals("0")) {
			System.out.println(0);
			return;
		}
		
		// 맨처음 숫자 처리
		if(s.charAt(0) == '7') sb.append(111);
		if(s.charAt(0) == '6') sb.append(110);
		if(s.charAt(0) == '5') sb.append(101);
		if(s.charAt(0) == '4') sb.append(100);
		if(s.charAt(0) == '3') sb.append(11);
		if(s.charAt(0) == '2') sb.append(10);
		if(s.charAt(0) == '1') sb.append(1);
		
		// 뒤의 숫자 처리
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == '7') sb.append("111");
			if(s.charAt(i) == '6') sb.append("110");
			if(s.charAt(i) == '5') sb.append("101");
			if(s.charAt(i) == '4') sb.append("100");
			if(s.charAt(i) == '3') sb.append("011");
			if(s.charAt(i) == '2') sb.append("010");
			if(s.charAt(i) == '1') sb.append("001");
			if(s.charAt(i) == '0') sb.append("000");
		}
		
		System.out.println(sb.toString());
	}
}
