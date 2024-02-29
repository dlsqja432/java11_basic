package exam;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		dog[0] = new Dog("불독1", "a");
		dog[1] = new Dog("불독2", "b");
		dog[2] = new Dog("불독3", "c");
		dog[3] = new Dog("불독4", "d");
		dog[4] = new Dog("불독5", "e");
		
		for(int i=0; i<5; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println();
		
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
		System.out.println();
		
		ArrayList<Dog> dog1 = new ArrayList<Dog>();
		dog1.add(new Dog("치와와1","a"));
		dog1.add(new Dog("치와와2","b"));
		dog1.add(new Dog("치와와3","c"));
		dog1.add(new Dog("치와와4","d"));
		dog1.add(new Dog("치와와5","e"));
		
		for(int i=0; i<dog1.size(); i++) {
			System.out.println(dog1.get(i).showDogInfo());
		}
		System.out.println();
		
		for(Dog d : dog1) {
			System.out.println(d.showDogInfo());
		}
	}

}
