package math3;
//2193번 이친수
import java.util.Scanner;

//점화식 : f(n) = f(n-1) + f(n-2)
public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n+1];
		
		if(n==1) {
			System.out.println(1);
			return;
		}
		dp[1] = 1;
		dp[2] = 1;
		for(int i=3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}	
}

