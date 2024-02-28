package sec1;

public class Notebook implements Computer {

	@Override
	public void display() {
		System.out.println("노트북의 기본 해상도 : 1000 x 500");
	}

	@Override
	public void typing() {
		System.out.println("노트북 키보드로 타이핑 합니다.");
	}

	@Override
	public void poewr(boolean sw) {
		if(sw) System.out.println("노트북의 전원을 켭니다.");
		else System.out.println("노트북의 전원을 끕니다.");		
	}

}
