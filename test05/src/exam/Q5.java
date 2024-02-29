package exam;

class Menu {
	final static int STARAMERICANO = 4000;
	final static int STARLATTE = 4300;
	final static int STARMACCHIATO = 4400;
	final static int BEANAMERICANO = 4100;
	final static int BEANLATTE = 4500;
	final static int BEANMACCHIATO = 4800;
}

class Human {
	String name;
	int money;
	
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCafe(StarCafe sCafe, int money) {
		String msg = sCafe.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money+ "원을 지불하여 " + msg);
		}
	}
	
	public void buyBeanCafe(BeanCafe bCafe, int money) {
		String msg = bCafe.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money+ "원을 지불하여 " + msg);
		}
	}
}

class StarCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "별 다방에서 아메리카노 구매";
		}
		else if(money == Menu.STARLATTE) {
			return "별 다방에서 라떼 구매";
		}
		else if(money == Menu.STARMACCHIATO) {
			return "별 다방에서 마끼야또 구매";
		}
		else {
			return null;
		}
	}
}

class BeanCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "콩 다방에서 아메리카노 구매";
		}
		else if(money == Menu.BEANLATTE) {
			return "콩 다방에서 라떼 구매";
		}
		else if(money == Menu.BEANMACCHIATO) {
			return "콩 다방에서 마끼야또 구매";
		}
		else {
			return null;
		}
	}
}

public class Q5 {
	public static void main(String[] args) {
		Human h1 = new Human("장인범", 30000);
		
		BeanCafe b1 = new BeanCafe();
		StarCafe s1 = new StarCafe();
		h1.buyBeanCafe(b1, 4800);
		h1.buyStarCafe(s1, 4300);
		System.out.println(h1.money);
	}
}
