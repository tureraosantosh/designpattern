package design.pattern.behavioral.mediator;

public class Flight implements Command {
	private IATC iatcMediator;

	@Override
	public void land() {
		if (iatcMediator.isAvailable()) {
			System.out.println(" Landed Successfully ");
			iatcMediator.setAvailibilityStatus(false);
		} else {
			System.out.println("Waiting For Runway ...");
		}
	}

	public Flight(IATC iatcMediator) {
		super();
		this.iatcMediator = iatcMediator;
	}

	public void readyToLand() {
		System.out.println("Landing Initiated ... ");
	}

	public void parked() {
		System.out.println("Flight is parked ..");
		iatcMediator.setAvailibilityStatus(true);
	}
}
