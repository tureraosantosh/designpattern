package design.pattern.creation.builder;

public class Phone {
public Phone() {
	// TODO Auto-generated constructor stub
}

	@Override
public String toString() {
	return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize + ", battery="
			+ battery + "]";
}

	public Phone(String os, int ram, String processor, double screenSize, int battery) {
	super();
	this.os = os;
	this.ram = ram;
	this.processor = processor;
	this.screenSize = screenSize;
	this.battery = battery;
}

	private String os;
	private int ram;
	private String processor;
	private  double screenSize;
	private int battery;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
}
