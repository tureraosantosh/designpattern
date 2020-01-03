package design.pattern.creation.abstractfactory;

public class Dell extends Device {

	private String ram;
	private String processor;
	
	public Dell() {
		// TODO Auto-generated constructor stub
	}
	public Dell(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", processor=" + processor + "]";
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
		// TODO Auto-generated method stub
		return "Dell Config is Size : "+this.ram+" Processor : "+this.processor;
	}

}
