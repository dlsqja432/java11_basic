package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class QueueEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue1 queue = new Queue1();
		int[] arr = new int[n];
		
		for(int i=1; i<=n; i++) {
			queue.push(i);
		}
		
		int p = 0;
		while(!queue.isEmpty()) {
			for(int i=0; i<k-1; i++) {
				queue.push(queue.pop());
			}
			arr[p] = queue.pop();
			p++;
		}
		
		System.out.print("<");
		for(int i=0; i<n-1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[n-1] + ">");
	}

}
