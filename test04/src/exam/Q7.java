package exam;

class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isValid() {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month==8 || month==10 || month==12) {
			if(day >32) return false;
			else return true;
		}
		else if(month==4 || month==6 || month==9 || month==11) {
			if(day > 31) return false;
			else return true;
		}
		else if(month==2) {
			if(day>29) return false;
			else return true;
		}
		else {
			return false;
		}
	}
}

public class Q7 {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
	}

}
