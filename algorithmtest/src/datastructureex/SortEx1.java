package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		
		Arrays.sort(arr); // 입력 배열 정렬
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int target = Integer.parseInt(st.nextToken());
			if(binarySearch(arr, target)) {
				bw.write("1");
			}
			else {
				bw.write("0");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 이진 탐색을 통해 배열에서 target을 찾는 메서드
	public static boolean binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == target) {
				return true;
			}
			else if(arr[mid] < target) {
				low = mid+1;
			}
			else {
				high = mid -1;
			}
		}
		
		return false;
	}

}
