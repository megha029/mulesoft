package com.app.accounts.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.accounts.SimpleRpcProducerRabbitApplication;
import com.app.accounts.dao.AccountDao;
import com.app.accounts.model.AccountDescriptor;
import com.app.accounts.model.AccountDescriptorList;
import com.app.accounts.service.AccountService;



@Service
public class AccountsServiceImpl implements AccountService  {

	@Autowired
	private AccountDao accountDaoImpl;
	@Autowired
	SimpleRpcProducerRabbitApplication producer;
	@Autowired
	BankCatalogClient bankCatalogClient;
	@Override
	public AccountDescriptorList getAccounts()throws Exception {	
		
	
    List<AccountDescriptor> accountDescriptorList =  accountDaoImpl.getAccountDesc();
		
        AccountDescriptorList acdList = new AccountDescriptorList();
          acdList.setAccountDescriptor(accountDescriptorList);
          
          producer.sendMessage(accountDescriptorList);
      	bankCatalogClient.getBankById(acdList.getAccountDescriptor().get(0).getCustomerId());
		
	
		return  acdList;
	}

	
	
}
