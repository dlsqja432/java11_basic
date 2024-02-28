package sec2;

public interface RemoteControl {
	int MAX = 10;
	int MIN = 0;
	
	// 추상 메서드(public)
	void turnOff();
	public void turnOn();
	public void setVolume(int vol);

//	디폴트 메서드(default method)
//	인터페이스의 메소드는 기본이 추상 메서드 이므로 선언만 해야한다. =? punlic
//	그러나 구현 내용을 기술하고 싶으면, 기본 접근 제한자 default로 명기하면 된다.
//	같은 패키지 내에 있는 클래스에서 default 메소드를 호출하여 실행할 수 있으며, 오버라이딩 할 수 있다.
	default void setMute(boolean mute){
		if(mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	
//	구현 내용 기술이 필요한 경우 static으로 지시자를 선언하면 된다.
//	객체 생성 없이 public 접근 제한으로 메소드를 호출하여 실행할 수 있으며, 오버라이딩 하지 않는다.
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
