package deep1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();	// 대소문자 구분을 없애기 위해 모두 대문자로 바꿈
		
		int[] frequency = new int[26];	// 알파벳 빈도 수를 저장할 배열
		
		// 각 알파벳의 빈도 수 계산
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(Character.isLetter(c)) {	// 알파벳인 경우에만 빈도수 계산
				frequency[c - 'A']++;
			}
		}
		
		// 가장 많이 등장하는 알파벳 찾기
		int maxFrequency = 0;
		char mostFrequentChar = '?';
		for(char c='A'; c<='Z'; c++) {
			if(frequency[c-'A'] > maxFrequency) {
				maxFrequency = frequency[c-'A'];
				mostFrequentChar = c;
			}
			else if(frequency[c-'A'] == maxFrequency) {
				mostFrequentChar = '?';
			}
		}
		System.out.println(mostFrequentChar);
	}
}
