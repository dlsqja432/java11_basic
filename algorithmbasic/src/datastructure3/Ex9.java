package datastructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			arr.add(s.substring(i));
		}
		
		Collections.sort(arr);
		
		for(String str : arr) {
			System.out.println(str);
		}
	}
}