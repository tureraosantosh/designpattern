package design.pattern.creation.abstractfactory;

public class Hp extends Device {

	private String ram;
	private String processor;

	public Hp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + "]";
	}

	public Hp(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
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
		return "Hp Config is Size : "+this.ram+" Processor : "+this.processor;
	}

}
