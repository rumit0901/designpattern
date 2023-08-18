package main;

import product.order.BankAccount;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount newAccount = new BankAccount
                .BankAccountBuilder("GP Coder", "0123456789")
                .withEmail("contact@gpcoder.com")
                .withNewsLetter(true)
                .build();
      System.out.println(newAccount);
	}

}
