package design.pattern.behavioral.state;

public class Vibration implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Mobile phone on vibration  mode..");
	}

}
