/**
 * 
 */
package com.app.accounts.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.accounts.dao.AccountDao;
import com.app.accounts.model.AccountDescriptor;
import com.app.accounts.repository.AccountRepository;

/**
 * @author megdesai
 *
 */
@Component
public class AccountDaoImpl implements AccountDao {

	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public List<AccountDescriptor> getAccountDesc()throws Exception {
		return accountRepository.getAccountDetails();
	}

}
