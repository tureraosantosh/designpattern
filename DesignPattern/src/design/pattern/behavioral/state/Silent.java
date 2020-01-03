package design.pattern.behavioral.state;

public class Silent implements MobileAlertState {

	@Override
	public void alert() {

		System.out.println("Mobile phone on silent ....");
	}

}
