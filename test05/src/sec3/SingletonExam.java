package sec3;

public class SingletonExam {

	public static void main(String[] args) {

		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		if(ins1 == ins2) {
			System.out.println("same");
		}
		if(ins1 == ins3) {
			System.out.println("same");
		}
	}

}
