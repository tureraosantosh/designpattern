package design.pattern.behavioral.state;

public class StateTests {

	public static void main(String[] args) {

		MobileContext context=new MobileContext();
		context.setState(new Vibration());
		context.alert();
	}

}
