package exam;

public class Q3 {

	public static void main(String[] args) {
		int[] abj = new int[5];
		
		int total = 0;
		for(int i=1; i<=5; i++) {
			abj[i-1] = i*2;
			total += abj[i-1];
		}
		System.out.println(total);
	}

}
