package sec2;

public class StudentExam1 {

	public static void main(String[] args) {

		Student s1 = new Student("장인범", 1, 100000);
		Student s2 = new Student("이원석", 2, 200000);
		Student s3 = new Student("조우진", 3, 300000);
		
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		System.out.println();
		
		Subway sub1 = new Subway(2);
		
		// 이원석 학생이 101번 버스를 두 번 이용하고, 지하철 2호선을 세 번 이용하였을 경우
		// 이원석 학생의 정보와 101번 버스의 정보와 지하철 2호선의 정보를 출력
		
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub1);
		s2.takeSubway(sub1);
		s2.takeSubway(sub1);
		s2.print();
		bus1.show();
		sub1.show();
	}

}
