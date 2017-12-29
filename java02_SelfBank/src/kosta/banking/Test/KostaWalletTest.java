package kosta.banking.Test;

import kosta.banking.Hogu;
import kosta.banking.Wallet;

public class KostaWalletTest {
	public static void main(String[] args) {
		
		
		Hogu h = new Hogu("JAMES",3039);
		
		h.Wallet(new Wallet(10000));
		
		h.getWallet().deposit(5000);
		h.getWallet().withdraw(2000);
		
		
		System.out.println(h.getWallet().getBalance());
	}
		
		
		
		
	}


