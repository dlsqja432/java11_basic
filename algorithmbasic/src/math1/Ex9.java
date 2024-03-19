package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int twoCount = countFactorial(n, 2) - countFactorial(n - m, 2) - countFactorial(m, 2);
        int fiveCount = countFactorial(n, 5) - countFactorial(n - m, 5) - countFactorial(m, 5);

        System.out.println(Math.min(twoCount, fiveCount));
    }

    public static int countFactorial(int num, int divisor) {
        int count = 0;
        while (num >= divisor) {
            count += num / divisor;
            num /= divisor;
        }
        return count;
    }
}
