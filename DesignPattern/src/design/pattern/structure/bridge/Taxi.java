package design.pattern.structure.bridge;

public class Taxi extends Automobile {

	public Taxi(WorkShop workShop1, WorkShop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	void manufacture() {
		workShop1.work();
		workShop2.work();

	}

}
