/**
 * 
 */
package com.ms.accounts.repository;

import java.util.List;

import com.ms.accounts.dto.Account;

public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
