package design.pattern.behavioral.template;

public class TempalteTest {

	public static void main(String[] args) {
		// laptop
		// server
		System.out.println("Laptop is being ready .....");
		ComputerTemplate laptop = new Laptop();
		laptop.buildComputer();
		System.out.println(" Server is being ready .......");
		ComputerTemplate server = new Server();
		server.buildComputer();

	}

}
