package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int leng = s.length()-1;
		StringBuilder sb = new StringBuilder();
		
		if(s.equals("0")) {
			System.out.println(0);
			return;
		}

		if(s.length()%3 == 0) {
			for(int i=0; i<leng; i+=3) {
				if(s.substring(i,i+3).equals("111")) sb.append(7);
				if(s.substring(i,i+3).equals("110")) sb.append(6);
				if(s.substring(i,i+3).equals("101")) sb.append(5);
				if(s.substring(i,i+3).equals("100")) sb.append(4);
				if(s.substring(i,i+3).equals("011")) sb.append(3);
				if(s.substring(i,i+3).equals("010")) sb.append(2);
				if(s.substring(i,i+3).equals("001")) sb.append(1);
				if(s.substring(i,i+3).equals("000")) sb.append(0);
			}
		}
		
		if(s.length()%3 == 2) {
			for(int i=0; i<leng; i+=3) {
				if(i==0) {
					if(s.substring(i,i+2).equals("11")) sb.append(3);
					if(s.substring(i,i+2).equals("10")) sb.append(2);
					if(s.substring(i,i+2).equals("01")) sb.append(1);
					if(s.substring(i,i+2).equals("00")) sb.append(0);
					i--;
				} else {
					if(s.substring(i,i+3).equals("111")) sb.append(7);
					if(s.substring(i,i+3).equals("110")) sb.append(6);
					if(s.substring(i,i+3).equals("101")) sb.append(5);
					if(s.substring(i,i+3).equals("100")) sb.append(4);
					if(s.substring(i,i+3).equals("011")) sb.append(3);
					if(s.substring(i,i+3).equals("010")) sb.append(2);
					if(s.substring(i,i+3).equals("001")) sb.append(1);
					if(s.substring(i,i+3).equals("000")) sb.append(0);
				}
			}
		}
		
		if(s.length()%3 == 1) {
			for(int i=0; i<leng; i+=3) {
				if(i==0) {
					if(s.substring(i,i+1).equals("1")) sb.append(1);
					if(s.substring(i,i+1).equals("0")) sb.append(0);
					i-=2;
				} else {
					if(s.substring(i,i+3).equals("111")) sb.append(7);
					if(s.substring(i,i+3).equals("110")) sb.append(6);
					if(s.substring(i,i+3).equals("101")) sb.append(5);
					if(s.substring(i,i+3).equals("100")) sb.append(4);
					if(s.substring(i,i+3).equals("011")) sb.append(3);
					if(s.substring(i,i+3).equals("010")) sb.append(2);
					if(s.substring(i,i+3).equals("001")) sb.append(1);
					if(s.substring(i,i+3).equals("000")) sb.append(0);
				}
			}
		}
		System.out.println(sb.toString());
		
//		int ten = 0;
//		int x = 1;
//		
//		// 2진수를 10빈수로 변환
//		for(int i=s.length()-1; i>=0; i--) {
//			int a = Integer.parseInt(String.valueOf(s.charAt(i)));
//			ten += a*x;
//			x *= 2;
//		}
//		
//		// 10진수를 8진수로 변환
//		int trash;
//		StringBuilder sb = new StringBuilder();
//		while(ten/8!=0) {
//			trash = ten%8;
//			ten /= 8;
//			sb.append(trash);
//		}
//		sb.append(ten);
//		
//		String b = sb.toString();
//		StringBuilder sb2 = new StringBuilder();
//		for(int i=b.length()-1; i>=0; i--) {
//			sb2.append(b.charAt(i));
//		}
//		System.out.println(sb2.toString());
	}
}
