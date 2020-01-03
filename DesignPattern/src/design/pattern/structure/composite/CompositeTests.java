package design.pattern.structure.composite;

public class CompositeTests {

	public static void main(String[] args) {

		Component hdd = new Leaf(2000, "HDD");
		Component mouse = new Leaf(200, "MOUSE");
		Component monitor = new Leaf(8000, "MONITOR");
		Component ram = new Leaf(4000, "RAM");
		Component cpu = new Leaf(9000, "CPU");

		Composite ph = new Composite("Pheripherals");
		Composite cb = new Composite("Cabinet");
		Composite mb = new Composite("Motherboard");
		Composite computer = new Composite("COMPUTER");
		mb.addComponent(ram);
		mb.addComponent(cpu);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cb.addComponent(hdd);
		cb.addComponent(mb);

		computer.addComponent(ph);
		computer.addComponent(cb);
		computer.showPrice();
	}

}
