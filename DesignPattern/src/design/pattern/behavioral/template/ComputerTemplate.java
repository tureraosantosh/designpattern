package design.pattern.behavioral.template;

public abstract class ComputerTemplate {

	final void buildComputer() {
		collectsComponentst();
		assembleComponents();
		installOs();
		startComputer();
		System.out.println("computer is on ");
	}

	private void startComputer() {

		System.out.println("System is booting ....");
	}

	public abstract void installOs();

	public abstract void assembleComponents();

	private void collectsComponentst() {

		System.out.println("Computer with 4GB , 1 TB HDD, 4GB Graphics, and I7 CPU. ");
	}

}
