package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		RemoteControl r1;
		
		// RemoteControl() 로 객체를 생성하려면, 구현 내용을 기술해야함
		r1 = new RemoteControl() {
			int volume;
			
			@Override
			public void turnOff() {
				System.out.println("전원 OFF");
			}

			@Override
			public void turnOn() {
				System.out.println("전원 ON");
			}

			@Override
			public void setVolume(int vol) {
				if(vol > MAX) {
					this.volume = RemoteControl.MAX;
				}
				else if(vol < MIN) {
					this.volume = RemoteControl.MIN;
				}
				else {
					this.volume = vol;
				}
			}
		};
		
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(5);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
	}

}
