package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex2 {
// S의 값에서 A1~AN을 각각 뺀 절대값들의 최대공약수를 구하는 문제
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st2.nextToken());
			arr.add(Math.abs(s-a));
		}
		if(n==1) {
			System.out.println(arr.get(0));
			return;
		}
		int gcd = 0;
		for(int i=0; i<n-1; i++) {
			if(gcd == 0) {
				gcd = gcd(arr.get(i), arr.get(i+1));
			} else {
				gcd = gcd(gcd, arr.get(i+1));
			}
		}
		System.out.println(gcd);
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
}
