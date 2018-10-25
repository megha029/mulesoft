
package com.app.accounts.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="accountdescriptor")
public class AccountDescriptor implements Serializable
{

    final static long serialVersionUID = -9161261303273961588L;
    @Id
    @Column(name="AccountId")
    private String accountId;
    
    @Column(name="AccountType")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
  
    @Column(name="DisplayName")
    private String displayName;
    
    @Column(name="Status")
    @Enumerated(EnumType.STRING)
    private Status status;
   
    @Column(name="Description")
    private String description;
    
    @JsonIgnore
    private String customerId;

    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public AccountDescriptor() {
        super();
    }

    /**
     * Creates a new AccountDescriptor.
     * 
     */
    public AccountDescriptor(String accountId, AccountType accountType, String displayName, Status status, String description) {
        super();
        this.accountId = accountId;
        this.accountType = accountType;
        this.displayName = displayName;
        this.status = status;
        this.description = description;
    }

    /**
     * Returns the accountId.
     * 
     * @return
     *     accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Set the accountId.
     * 
     * @param accountId
     *     the new accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Returns the accountType.
     * 
     * @return
     *     accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Set the accountType.
     * 
     * @param accountType
     *     the new accountType
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Returns the displayName.
     * 
     * @return
     *     displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Set the displayName.
     * 
     * @param displayName
     *     the new displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the status.
     * 
     * @return
     *     status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Set the status.
     * 
     * @param status
     *     the new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Returns the description.
     * 
     * @return
     *     description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description.
     * 
     * @param description
     *     the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(accountType).append(displayName).append(status).append(description).toHashCode();
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
        AccountDescriptor otherObject = ((AccountDescriptor) other);
        return new EqualsBuilder().append(accountId, otherObject.accountId).append(accountType, otherObject.accountType).append(displayName, otherObject.displayName).append(status, otherObject.status).append(description, otherObject.description).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).append("accountId", accountId).append("accountType", accountType).append("displayName", displayName).append("status", status).append("description", description).toString();
    }

}
