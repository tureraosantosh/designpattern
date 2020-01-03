package design.pattern.behavioral.stratergy;

public class Player {

	IStraterg iStraterg;
	String type;

	public Player(String type) {

		this.type = type;
	}

	public void setStratergy(IStraterg iStraterg) {
		this.iStraterg = iStraterg;
	}

	public void action() {
		System.out.println("Palayer " + this.type);
		iStraterg.actionCommand();
	}

}
