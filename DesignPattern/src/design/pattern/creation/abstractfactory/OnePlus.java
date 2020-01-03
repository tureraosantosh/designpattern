package design.pattern.creation.abstractfactory;

public  class OnePlus extends Device {
	private String ram;
	private String processor;
	public OnePlus() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OnePlus [ram=" + ram + ", processor=" + processor + "]";
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

	public OnePlus(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "OnePlus Config is Size : "+this.ram+" Processor : "+this.processor;

	}

}
