package design.pattern.structure.adapter;

public class Person {
	private String carNo;
	private String licenceNo;
	private String bankAccount;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Person [carNo=" + carNo + ", licenceNo=" + licenceNo + ", bankAccount=" + bankAccount + "]";
	}

	public Person(String carNo, String licenceNo, String bankAccount) {
		super();
		this.carNo = carNo;
		this.licenceNo = licenceNo;
		this.bankAccount = bankAccount;
	}

}
