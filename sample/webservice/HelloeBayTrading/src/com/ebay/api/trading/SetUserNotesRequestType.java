// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables users to add, replace, and delete My eBay notes for
 * items that are being tracked in the My eBay All Selling and
 * All Buying areas.
 * 
 */
@RootElement(name = "SetUserNotesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetUserNotesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "Action")
	@Order(value=1)
	public SetUserNotesActionCodeType action;	
	
	@Element(name = "NoteText")
	@Order(value=2)
	public String noteText;	
	
	@Element(name = "TransactionID")
	@Order(value=3)
	public String transactionID;	
	
	@Element(name = "VariationSpecifics")
	@Order(value=4)
	public NameValueListArrayType variationSpecifics;	
	
	@Element(name = "SKU")
	@Order(value=5)
	public String sku;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=6)
	public String orderLineItemID;	
	
    
}