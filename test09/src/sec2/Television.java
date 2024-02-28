package sec2;

public class Television implements Screen {
	int volume;
	int lightness;
	int zoom;

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

	@Override
	public int light() {
		if(this.lightness < 255 && this.lightness > 0) {
			this.lightness++;
		}
		return this.lightness;
	}

	@Override
	public int dark() {
		if(this.lightness < 255 && this.lightness > 0) {
			this.lightness--;
		}
		return this.lightness;
	}

	@Override
	public int zoomin() {
		if(zoom >= -500 && zoom <= 500) {
			zoom += 50;
		}
		return zoom;
	}

	@Override
	public int zoomout() {
		if(zoom >= -500 && zoom <= 500) {
			zoom -= 50;
		}
		return zoom;
	}
	
}
