package org.kh.app2;
// 반복문 : for, while, do~while~
public class Loop1 {

	public static void main(String[] args) {

		int n = 0;
		
		// 조건식이 참 일 때 동안만 반복수행한다.
		// for(초기식; 조건식; 증감식) { 반복해야할 문장 }
		for(int i=0; i<100; i++) {
			n += 1;
		}
		
		System.out.println("n = " + n);
		
		// 배열
		int[] nums = {80, 95, 75, 60, 100, 65, 70, 90, 85, 95};
		String[] names = {"김", "이", "박", "최", "정", "오", "배", "강", "장", "계"};
		int total = 0;
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		System.out.println("이름\t점수\t학점\t판정");
		for(int i=0; i<10; i++) {
			total += nums[i];
			System.out.print(names[i] + "\t");
			System.out.print(nums[i] + "\t");
			if(nums[i] >= 90) {
				System.out.print("A\t");
			}
			else if(nums[i] >= 80) {
				System.out.print("B\t");
			}
			else if(nums[i] >= 70) {
				System.out.print("C\t");
			}
			else if(nums[i] >= 60) {
				System.out.print("D\t");
			}
			else {
				System.out.print("F\t");
			}
			
			if(nums[i] >= 70) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
			
			if(max < nums[i]) {
				max = nums[i];
			}
			
			if(min > nums[i]){
				min  = nums[i];
			}
		}
		
		double avg = total/10.0;
		System.out.println("전체 총점 : " + total);
		System.out.println("전체 평균 : " + avg);
		System.out.println("최대 점수 : " + max);
		System.out.println("최소 점수 : " + min);
	}

}
