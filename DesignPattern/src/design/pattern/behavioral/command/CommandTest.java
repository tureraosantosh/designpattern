package design.pattern.behavioral.command;

public class CommandTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();// Remote Control class not depend or tight coupled..
		remote.setCommand(new TvOnCommand(new Tv()));
		remote.pressButton();
		remote.setCommand(new SetTopBoxOnCommand(new SetTopBox()));
		remote.pressButton();

	}

}
