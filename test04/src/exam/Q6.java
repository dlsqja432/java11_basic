package exam;

class Person {
	private int age;
	private String name;
	private String gender;
	private boolean isMarried;
	private int baby;
	
	public Person(int age, String name,String gender,boolean isMarried, int baby) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.baby = baby;
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public int getBaby() {
		return baby;
	}
	public void setBaby(int baby) {
		this.baby = baby;
	}
	
	public void showInfo() {
		if(isMarried) {
			System.out.println("나이가 " + age + "살, 이름이 " + name + "라는 남자가 있습니다."
				+ " 이 " + gender + "는 결혼을 했고, 자식이 " + baby + "명 있습니다.");
		}
		else {
			System.out.println("나이가 " + age + "살, 이름이 " + name + "라는 남자가 있습니다."
					+ " 이 " + gender + "는 결혼을 안했고, 자식이 " + baby + "명 있습니다.");
		}
	}
}

public class Q6 {

	public static void main(String[] args) {
		Person p = new Person(40,"James","여자",true,3);
		p.showInfo();
	}

}
