// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Collection of zero, one, or multiple individual detail account entries. Contains
 * one AccountEntry object for each account entry returned. See the schema
 * documentation for AccountEntryType for details on its properties. You can uniquely identify
 * the entries that the GetAccount call returns within the AccountEntries tag.
 * Specifically, the following fields, returned within the AccountEntries tag,
 * can be used in combination as a unique key: AccountEntry.Date, AccountEntry.AccountDetailsEntryType,
 * AccountEntry.ItemID, and AccountEntry.RefNumber.
 * 
 */
public class AccountEntriesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AccountEntry")
	@Order(value=0)
	public List<AccountEntryType> accountEntry;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}