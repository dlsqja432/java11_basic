package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {

		Birthday birth1 = new Birthday();
		birth1.setName("장인범");
		birth1.setYear(1996);
		birth1.setMonth(11);
		birth1.setDay(13);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("이원만");
		birth2.setYear(1960);
		birth2.setMonth(10);
		birth2.setDay(18);
		birth2.birth();
		birth2.birthAddr();
	}

}
