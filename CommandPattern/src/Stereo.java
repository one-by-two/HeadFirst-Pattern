
public class Stereo {
	String location;
	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Stereo is On");
	}
	
	public void off() {
		System.out.println(location + " Stereo is Off");
	}
	public void setCd() {
		System.out.println(location + " Stereo setCd");
	}
	public void setDvd() {
		System.out.println(location + " Stereo setDvd");
	}
	public void setRadio() {
		System.out.println(location + " Stereo Radio");
	}
	public void setVolume(int volume) {
		System.out.println(location + " Stereo Volume: " + volume);
	}
}
