package exam04;

public class GamerExam {

	public static void main(String[] args) {
		Gamer g1;
		System.out.println("===== 아마추어 =====");
		g1 = new Amateur();
		g1.run(10);
		g1.jump(20);
		g1.turn(30);
		g1.show("장인범");
		
		System.out.println("\n===== 프로게이머 =====");
		g1 = new Progamer();
		g1.run(10);
		g1.jump(20);
		g1.turn(30);
		g1.show("장인범");
	}

}
