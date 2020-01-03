package design.pattern.creation.abstractfactory;

public class Nokia extends Device {

	private String ram;
	private String processor;
	
	public Nokia(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Nokia [ram=" + ram + ", processor=" + processor + "]";
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Nokia Config is Size : "+this.ram+" Processor : "+this.processor;
	}

}
