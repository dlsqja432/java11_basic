package org.kh.app2;

public class StarPrint {

	public static void main(String[] args) {

		// 1번
		System.out.println("1번");
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2번
		System.out.println("2번");
		for(int i=0; i<6; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3번
		System.out.println("3번");
		for(int i=0; i<6; i++) {
			for(int j=0; j<6-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 4번
		System.out.println("4번");
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 5번
		System.out.println("5번");
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(j>=5-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 6번
		System.out.println("6번");
		for(int i=0; i<11; i++) {
			int star = i;
			if(i>5) {
				star = 11-i-1;
			}
			for(int j=0; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 7번
		System.out.println("7번");
		for(int i=0; i<11; i++) {
			int star = i;
			if(i>5) {
				star = 11 - star - 1;
			}
			for(int j=0; j<6-star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 8번
		System.out.println("8번");
		for(int i=0; i<11; i++) {
			int space = i;
			int star = i+1;
			if(i >= 6) {
				space = 10-i;
				star = 11-i;
			}
			
			for(int j=0; j<5-space; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 9번
		System.out.println("9번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i+1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 10번
		System.out.println("10번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*(4-i)+1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 11번
		System.out.println("11번");
		for(int i=0; i<9; i++) {
			int space = i;
			int star = i;
			if(i>=5) {
				space = 8-i;
				star = 8-i;
			}
			
			for(int j=0; j<4-space; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*star +1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<4-space; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 12번
		System.out.println("12번");
		for(int i=0; i<9; i++) {
			int space = i;
			int star = i;
			if(i>=5) {
				star = 8-i;
				space = 8-i;
			}
			for(int j=0; j<5-star; j++) {
				System.out.print("*");
			}
			for(int j=0; j<(2*space +1); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	} 
}



  
   
















