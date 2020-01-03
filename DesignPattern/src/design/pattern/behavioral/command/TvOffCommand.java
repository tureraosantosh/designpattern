package design.pattern.behavioral.command;

public class TvOffCommand implements Command {

	Tv tv;

	public TvOffCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

}
