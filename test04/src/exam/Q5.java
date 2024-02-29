package exam;

public class Q5 {

	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			int tmp = i;
			if(tmp>=4) {
				tmp = 6 - tmp;
			}
			for(int j=tmp; j<3; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*tmp+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
