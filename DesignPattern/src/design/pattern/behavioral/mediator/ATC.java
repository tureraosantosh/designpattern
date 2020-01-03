package design.pattern.behavioral.mediator;

public class ATC implements IATC {
	private Flight flight;
	private Runway runway;
	private Boolean available;

	@Override
	public void registerFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public void registerRunway(Runway runway) {
		this.runway = runway;

	}

	@Override
	public void setAvailibilityStatus(Boolean status) {
		this.available = status;
	}

	@Override
	public Boolean isAvailable() {
		// TODO Auto-generated method stub
		return this.available;
	}

}
