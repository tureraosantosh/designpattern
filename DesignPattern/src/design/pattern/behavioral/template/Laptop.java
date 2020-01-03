package design.pattern.behavioral.template;

public class Laptop extends ComputerTemplate {

	@Override
	public void installOs() {
		System.out.println("Installing windows ..");
	}

	@Override
	public void assembleComponents() {
		System.out.println("Joining All Units plus HDMI 4 Port ");
	}

}
