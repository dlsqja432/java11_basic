package loof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tokenCount = st.countTokens();
		int[] tokens = new int[tokenCount];
		
		for(int i=0; i<tokenCount; i++) {
			tokens[i] = Integer.parseInt(st.nextToken());
			if(tokens[i] >= 65) {
				tokens[i] -= 55;
			}
		}
		
		
	}

}
