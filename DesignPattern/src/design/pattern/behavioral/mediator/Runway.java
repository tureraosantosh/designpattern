package design.pattern.behavioral.mediator;

public class Runway implements Command {

	private IATC iatcMediator;

	public Runway() {
		// TODO Auto-generated constructor stub
	}

	public Runway(IATC iatcMediator) {
		this.iatcMediator = iatcMediator;
	}

	@Override
	public void land() {
		System.out.println("Runway is Available for Landing ... ");
		iatcMediator.setAvailibilityStatus(true);
	}

}
