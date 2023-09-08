package aop.service;

import aop.model.Account;

public interface AccountService {

	void addAccount(Account account);
	
	void removeAccount(Account account);
	
	int getSize();
}
