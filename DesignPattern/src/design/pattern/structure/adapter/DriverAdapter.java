package design.pattern.structure.adapter;

public class DriverAdapter extends TaxiDriver implements Driver {

	private Person person;

	public DriverAdapter(Person person) {
		this.person = person;
		this.adaptData();
	}
	private void adaptData() {
		this.setCarNo(person.getCarNo());
		this.setLicencseNo(Integer.valueOf(person.getLicenceNo()));
		String[] personBankAccount = person.getBankAccount().split(",");
		BanckAccount driverBankAccount = new BanckAccount(personBankAccount[0], personBankAccount[1],
				personBankAccount[2], personBankAccount[3]);
		this.setBankAccount(driverBankAccount);

	}
}
