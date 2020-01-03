package design.pattern.structure.adapter;

public class TaxiDriver implements Driver {
	String carNo;
	Integer licencseNo;
	BanckAccount bankAccount;

	@Override
	public String getCarNo() {
		// TODO Auto-generated method stub
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public void setLicencseNo(Integer licencseNo) {
		this.licencseNo = licencseNo;
	}

	public void setBankAccount(BanckAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public Integer getLicencseNo() {
		// TODO Auto-generated method stub
		return licencseNo;
	}

	@Override
	public BanckAccount getBankAccount() {
		// TODO Auto-generated method stub
		return bankAccount;
	}

}
