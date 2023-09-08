package aop.service;

import java.util.ArrayList;
import java.util.List;

import aop.model.Account;

public class AccountServiceImpl implements AccountService {
	
	private List<Account> accounts = new ArrayList<Account>(); 

	@Override
	public void addAccount(Account account) {
		System.out.println("addAccount " + account);
		accounts.add(account);	}

	@Override
	public void removeAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("removeAccount " + account);
		accounts.remove(account);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		System.out.println("getSize: " + accounts.size());
        return accounts.size();
	}

}
