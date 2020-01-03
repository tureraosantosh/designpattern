package design.pattern.structure.adapter;

public class BanckAccount {
	private String accountNo;
	private String bankName;
	private String IFSCNo;
	private String cityName;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIFSCNo() {
		return IFSCNo;
	}

	public void setIFSCNo(String iFSCNo) {
		IFSCNo = iFSCNo;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public BanckAccount(String accountNo, String bankName, String iFSCNo, String cityName) {
		super();
		this.accountNo = accountNo;
		this.bankName = bankName;
		IFSCNo = iFSCNo;
		this.cityName = cityName;
	}

	public BanckAccount() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BanckAccount [accountNo=" + accountNo + ", bankName=" + bankName + ", IFSCNo=" + IFSCNo + ", cityName="
				+ cityName + "]";
	}

}
