package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class HashMapEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		StringTokenizer input1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(input1.nextToken());
			arrList.add(num);
			map.put(num, true);
		}
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer input2 = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(input2.nextToken());
			if(map.containsKey(num)) {
				bw.write("1 ");
			}
			else bw.write("0 ");
		}
		bw.flush();
	}
}
