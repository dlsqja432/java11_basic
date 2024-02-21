package inoutput;
import java.util.Scanner;

public class Year {

	public static void main(String[] args) {

		int year;
		
		Scanner scanner = new Scanner(System.in);
		
		year = scanner.nextInt();
		
		System.out.println(year-543);
		
		scanner.close();
	}

}
