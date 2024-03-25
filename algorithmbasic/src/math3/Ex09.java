package math3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11053번 가장 긴 증가하는 부분 수열
public class Ex09 {

//	점화식 : 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		
		dp[1] = 1;
		for(int i=1; i<n; i++) {
			if(arr[i+1] > arr[i]) {
				dp[i+1] = dp[i]+1;
			} else {
				dp[i+1] = dp[i];
			}
		}
		
		System.out.println(dp[n]);
	}	
}
