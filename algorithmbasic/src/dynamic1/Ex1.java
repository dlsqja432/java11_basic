package dynamic1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];	// dp[i] : i를 1로 만들기 위한 최소 연산 횟수
		
		// Bottom-up 방식으로 다이나믹 프로그래밍 수행
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + 1;
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		System.out.println(dp[n]);
	}
}
