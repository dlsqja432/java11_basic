package sec2;

public class Audio implements RemoteControl {
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
		System.out.println("현재 볼륨 : " + vol);
	}
	
}
