package org.kh.app2;

public class Loop3 {

	public static void main(String[] args) {

		// 합격 불합격 판별 프로그램
		int[] nums = {80, 95, 75, 60, 100, 65, 70, 90, 85, 95};
		
		// 중요한 자바 1.6 이상의 개선된 for문
		for(int n : nums) {
			if(n >= 80) {
				System.out.println("합격입니다");
			}
			
			else {
				System.out.println("불합격입니다");
			}
		}
	}

}
