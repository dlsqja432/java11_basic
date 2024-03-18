package datastructure3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[26];
		String s = br.readLine();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(arr[c - 'a'] != -1) continue;
			arr[c - 'a'] = i;
		}
		
		for(int i : arr) {
			bw.write(i + " ");
		}
		bw.flush();
	}
}
