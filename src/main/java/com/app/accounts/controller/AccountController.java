
package com.app.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.accounts.exception.CustomizedExceptionHandler;
import com.app.accounts.model.AccountDescriptorList;
import com.app.accounts.service.AccountService;
import com.app.accounts.service.impl.BankCatalogClient;

/**
 * No description (Generated with springmvc-raml-parser v.2.0.0)
 * 
 */
@RestController
@RequestMapping(value = "/api/v1/dda", produces = "application/json")
@Validated
public class AccountController {
	@Autowired
	private AccountService accountServiceImpl;

	/*@Autowired
	BankCatalogClient bankCatalogClient;*/

	/**
	 * Get a lightweight list of accounts
	 * 
	 */

	@GetMapping(value = "/accounts")
	public ResponseEntity<?> getAccountDetails() {

		try {
			/*AccountDescriptorList acc = new AccountDescriptorList();
			acc = accountServiceImpl.getAccounts();
			bankCatalogClient.getBankById(acc.getAccountDescriptor().get(0).getCustomerId());*/
			return new ResponseEntity<AccountDescriptorList>(accountServiceImpl.getAccounts(), HttpStatus.OK);

		} catch (Exception ex) {
			return new CustomizedExceptionHandler().handleInternalError(ex);
		}

	}

}
