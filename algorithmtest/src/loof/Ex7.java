package loof;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + String.valueOf(a) + " + "
			+ String.valueOf(b) + " = " + String.valueOf(a+b));
			bw.newLine();
		}
		bw.flush();
		
//		Scanner scanner = new Scanner(System.in);
//		int t = scanner.nextInt();
//		
//		for(int i=1; i<=t; i++) {
//			int a = scanner.nextInt();
//			int b = scanner.nextInt();
//			System.out.println("Case #" + i + ": " + (a+b));
//		}
//		
//		scanner.close();
	}

}
