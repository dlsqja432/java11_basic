package sec2;

public class RemoteExam2 {

	public static void main(String[] args) {
		Screen s1;
		
		s1 = new Screen() {
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
		
		RemoteControl.changeBattery();
		s1.turnOn();
		s1.light();
		s1.light();
		s1.light();
		s1.dark();
		s1.zoomin();
		s1.zoomin();
		s1.zoomout();
		s1.setVolume(12);
		s1.setMute(true);
		s1.setMute(false);
		s1.turnOff();
	}
}













