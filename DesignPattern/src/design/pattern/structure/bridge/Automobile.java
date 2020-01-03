package design.pattern.structure.bridge;

public abstract class Automobile {

	protected WorkShop workShop1;
	protected WorkShop workShop2;

	protected Automobile(WorkShop workShop1, WorkShop workShop2) {
		System.out.print(" bus is ");
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	abstract void manufacture();

}
