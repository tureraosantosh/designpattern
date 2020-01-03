package design.pattern.behavioral.mediator;

public class MediatorTests {

	public static void main(String[] args) {
		IATC atcMedicator=new ATC();
		Runway runway=new Runway(atcMedicator);
		Flight flight111=new Flight(atcMedicator);
		atcMedicator.registerFlight(flight111);
		atcMedicator.registerRunway(runway);
		flight111.readyToLand();
		runway.land();
		flight111.land();
	}
	
	
	
	
}
