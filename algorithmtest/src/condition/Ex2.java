package condition;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int TestScore;
		
		Scanner scanner = new Scanner(System.in);
		
		TestScore = scanner.nextInt();
		
		if(TestScore >= 90) {
			System.out.println("A");
		}
		
		else if(TestScore >= 80) {
			System.out.println("B");
		}
		
		else if(TestScore >= 70) {
			System.out.println("C");
		}
		
		else if(TestScore >= 60) {
			System.out.println("D");
		}
		
		else {
			System.out.println("F");
		}
		
		scanner.close();
	}

}
