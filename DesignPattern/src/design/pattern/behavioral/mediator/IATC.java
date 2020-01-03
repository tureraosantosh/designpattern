package design.pattern.behavioral.mediator;

public interface IATC {

	 void registerFlight(Flight flight);
	 void registerRunway(Runway runway);
	 void setAvailibilityStatus(Boolean status);
	 Boolean isAvailable();
}
