package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		long result = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int si = Integer.parseInt(st.nextToken());
			for(int p=0; p<si; p++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int j=0; j<arr.size()-1; j++) {
				for(int k=j+1; k<arr.size(); k++) {
					result = result + gcd(arr.get(j), arr.get(k));
				}
			}
			System.out.println(result);
			result = 0;
			arr.clear();
		}
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
