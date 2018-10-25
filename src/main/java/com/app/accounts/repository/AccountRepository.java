package com.app.accounts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.accounts.model.AccountDescriptor;

@Repository
public interface AccountRepository extends CrudRepository<AccountDescriptor, String> {
	
@Query(value= "select *  from accountdescriptor", nativeQuery=true)

public List<AccountDescriptor>  getAccountDetails();
} 
	
	
	


