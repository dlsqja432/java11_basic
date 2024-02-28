package sec2;

public class RemoteExam4 {

	public static void main(String[] args) {
		Audio a1 = new Audio();
		
		RemoteControl.changeBattery();
		a1.turnOn();
//		a1.light();
//		a1.light();
//		a1.light();
//		a1.dark();
//		a1.zoomin();
//		a1.zoomin();
//		a1.zoomout();
		a1.setVolume(20);
		a1.setMute(true);
		a1.setMute(false);
		a1.turnOff();
	}

}
