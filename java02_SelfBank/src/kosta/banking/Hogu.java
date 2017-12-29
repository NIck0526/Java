package kosta.banking;

public class Hogu {
	
	String name;
	int ssn;
	Wallet wallet;
	
	public Hogu(String name, int ssn) {
	
		this.name = name;
		this.ssn = ssn;	
	}
	
	public void Wallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	public Wallet getWallet() {
		return wallet;
	}
	
	

}
