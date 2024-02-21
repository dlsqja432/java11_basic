package array;

import java.util.Scanner;

public class Exa1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[] score = new double[n];
		double max = 0;
		double avg = 0;
		
		for(int i=0; i<n; i++) {
			score[i] = scan.nextDouble();
			if(i==0) {
				max = score[i];
				continue;
			}
			if(score[i] > max) {
				max = score[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			avg = avg +(score[i] / max * 100);
		}
		System.out.println(avg/n);
		scan.close();
	}

}