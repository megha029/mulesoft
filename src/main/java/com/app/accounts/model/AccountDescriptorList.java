
package com.app.accounts.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AccountDescriptorList implements Serializable
{

    final static long serialVersionUID = -9161261303273961588L;
    
  
//    private List<AccountDescriptor> accountDescriptorList; 
//    
//    public List<AccountDescriptor> getAccountDescriptor() {
//		return accountDescriptorList;
//	}
//
//
//	public void setAccountDescriptor(List<AccountDescriptor> accountDescriptor) {
//		this.accountDescriptorList = accountDescriptor;
//	}
//	public AccountDescriptorList() {
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public AccountDescriptorList(List<AccountDescriptor> accountDescriptor) {
//		super();
//		this.accountDescriptorList = accountDescriptor;
//	}
	

    private List<AccountDescriptor> accountDescriptorList = new ArrayList<AccountDescriptor>();
    

    /**
     * Creates a new AccountDescriptorList.
     * 
     */
    public AccountDescriptorList() {
        
    }

    /**
     * Creates a new AccountDescriptorList.
     * 
     */
    public AccountDescriptorList(List<AccountDescriptor> accountDescriptorList) {
        
        this.accountDescriptorList = accountDescriptorList;
    }

    /**
     * Returns the accountDescriptor.
     * 
     * @return
     *     accountDescriptor
     */
    public List<AccountDescriptor> getAccountDescriptor() {
        return accountDescriptorList;
    }

    /**
     * Set the accountDescriptor.
     * 
     * @param accountDescriptor
     *     the new accountDescriptor
     */
    public void setAccountDescriptor(List<AccountDescriptor> accountDescriptorList) {
        this.accountDescriptorList = accountDescriptorList;
        
    }

    public int hashCode() {
        return new HashCodeBuilder().append(accountDescriptorList).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (this.getClass()!= other.getClass()) {
            return false;
        }
        AccountDescriptorList otherObject = ((AccountDescriptorList) other);
        return new EqualsBuilder().append(accountDescriptorList, otherObject.accountDescriptorList).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).append("accountDescriptorList", accountDescriptorList).toString();
    }


	
}
