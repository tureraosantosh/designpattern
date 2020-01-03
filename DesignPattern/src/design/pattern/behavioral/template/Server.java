package design.pattern.behavioral.template;

public class Server extends ComputerTemplate {

	@Override
	public void installOs() {

		System.out.println("Installing Linux Operating System...");
	}

	@Override
	public void assembleComponents() {
		System.out.println("Assembling Servers with VGA Port ");

	}

}
