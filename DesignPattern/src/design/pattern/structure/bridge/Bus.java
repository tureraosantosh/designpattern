package design.pattern.structure.bridge;

public class Bus extends Automobile {

	public Bus(WorkShop workShop1, WorkShop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	void manufacture() {

		workShop1.work();
		workShop2.work();
	}

}
