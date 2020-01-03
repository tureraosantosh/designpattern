package design.pattern.behavioral.command;

public class RemoteControl {

	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}
