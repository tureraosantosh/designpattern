package design.pattern.behavioral.command;

public class SetTopBoxOnCommand implements Command {

	SetTopBox setTopBox;

	public SetTopBoxOnCommand() {
		// TODO Auto-generated constructor stub
	}

	public SetTopBoxOnCommand(SetTopBox setTopBox) {
		this.setTopBox = setTopBox;
	}

	@Override
	public void execute() {

		setTopBox.on();
		setTopBox.setChannel(201);
		setTopBox.setVolumn(20);
	}

}
