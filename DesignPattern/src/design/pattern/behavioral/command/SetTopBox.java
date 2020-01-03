package design.pattern.behavioral.command;

public class SetTopBox {

	public void on() {
		System.out.println("Set Top Box is ON ");
	}

	public void off() {
		System.out.println("Set Top Box is Off ");
	}

	public void setChannel(int defaultChannel) {
		System.out.println("Chanel seted : " + defaultChannel);
	}

	public void setVolumn(int volumn) {
		System.out.println("Volumn set " + volumn);
	}
}
