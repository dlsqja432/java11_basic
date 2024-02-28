package sec2;
// RemoteControl 으로 선언하여 RemoteControl, Screen, Television, Audio 로 형 변환 하여 활용하기
public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r;	// RemoteControl 객체 선언
		r = new RemoteControl() {
			int volume;
			
			public void turnOff() {
				System.out.println("전원 OFF");
			}

			public void turnOn() {
				System.out.println("전원 ON");
			}

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
		
		System.out.println("\nRemoteControl");
		RemoteControl.changeBattery();
		r.turnOn();
		r.setVolume(5);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
		
		
		r = new Screen() {
			int volume;
			int lightness;
			int zoom;

			public void turnOff() {
				System.out.println("빔프로젝트 전원 OFF");
			}

			public void turnOn() {
				System.out.println("빔프로젝트 전원 ON");
			}

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

			public int light() {
				if(this.lightness < 255 && this.lightness > 0) {
					this.lightness++;
				}
				return this.lightness;
			}

			public int dark() {
				if(this.lightness < 255 && this.lightness > 0) {
					this.lightness--;
				}
				return this.lightness;
			}

			public int zoomin() {
				if(zoom >= -500 && zoom <= 500) {
					zoom += 50;
				}
				return zoom;
			}

			public int zoomout() {
				if(zoom >= -500 && zoom <= 500) {
					zoom -= 50;
				}
				return zoom;
			}
			
		};
		
		System.out.println("\nScreen");
		RemoteControl.changeBattery();
		r.turnOn();
//		r.light();
//		r.light();
//		r.light();
//		r.dark();
//		r.zoomin();
//		r.zoomin();
//		r.zoomout();
		r.setVolume(12);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
		
		r = new Television();
		
		System.out.println("\nTelevision");
		RemoteControl.changeBattery();
		r.turnOn();
//		r.light();
//		r.light();
//		r.light();
//		r.dark();
//		r.zoomin();
//		r.zoomin();
//		r.zoomout();
		r.setVolume(12);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
		
		r = new Audio();
		
		System.out.println("\nAudio");
		RemoteControl.changeBattery();
		r.turnOn();
//		r.light();
//		r.light();
//		r.light();
//		r.dark();
//		r.zoomin();
//		r.zoomin();
//		r.zoomout();
		r.setVolume(12);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
	}

}
