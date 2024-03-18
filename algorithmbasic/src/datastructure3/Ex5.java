package datastructure3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = null;
		
		while((s=br.readLine()) != null) {
			int[] arr = new int[4];
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c-'a'>=0 && c-'a' <=25) {
					arr[0]++;
				} else if(c-'A'>=0 && c-'A'<=25) {
					arr[1]++;
				} else if(c == ' ') {
					arr[3]++;
				} else if(Integer.parseInt(String.valueOf(c)) >= 0 && Integer.parseInt(String.valueOf(c)) <= 9) {
					arr[2]++;
				}
			}
			
			for(int i : arr) {
				System.out.print(i + " ");
			}
		}
	}
}
