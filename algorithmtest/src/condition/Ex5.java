package condition;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		int hour;
		int minute;
		
		Scanner scanner = new Scanner(System.in);
		
		hour = scanner.nextInt();
		minute = scanner.nextInt();
		
		if(minute < 45) {
			if(hour == 0) {
				hour = 23;
				minute += 15;
			}
			else {
				hour -= 1;
				minute += 15;
			}
		}
		
		else {
			minute -= 45;
		}
		
		System.out.println(hour);
		System.out.println(minute);
		
		scanner.close();
	}

}
