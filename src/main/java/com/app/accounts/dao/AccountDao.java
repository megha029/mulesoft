/**
 * 
 */
package com.app.accounts.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.accounts.model.AccountDescriptor;


/**
 * @author spawar24
 *
 */
@Component
public interface AccountDao {
	
	public List<AccountDescriptor> getAccountDesc()throws Exception;

}
