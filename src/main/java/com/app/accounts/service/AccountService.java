package com.app.accounts.service;

import org.springframework.stereotype.Service;

import com.app.accounts.model.AccountDescriptorList;


@Service
public interface AccountService {
	public AccountDescriptorList getAccounts()throws Exception;

}
