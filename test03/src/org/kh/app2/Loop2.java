package org.kh.app2;

public class Loop2 {

	public static void main(String[] args) {

		int[] ns = {9, 12, 3, 7, 6, 8, 10, 11};
		int max = Integer.MIN_VALUE; // int 최소값
		int min = Integer.MAX_VALUE; // int 최대값
		
		for(int i=0; i<ns.length; i++) {
//			if(i==0) {
//				max = ns[0];
//				min = ns[0];
//			}
			
			if(ns[i] > max) {
				max = ns[i];
			}
			
			if(ns[i] < min) {
				min = ns[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
