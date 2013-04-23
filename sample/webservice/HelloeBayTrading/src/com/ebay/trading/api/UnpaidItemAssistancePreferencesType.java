// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *   This type defines the <b>UnpaidItemAssistancePreferences</b> container. This container is
 * used in <b>SetUserPreferences</b> to set the preferences related to the <b>Unpaid Item
 * Assistant</b> feature. The <b>UnpaidItemAssistancePreferences</b> container is also returned in
 * <b>GetUserPreferences</b> (if the <b>ShowUnpaidItemAssistancePreference</b> flag is included and
 * set to true in the request).
 * 
 */
public class UnpaidItemAssistancePreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DelayBeforeOpeningDispute")
	@Order(value=0)
	public Integer delayBeforeOpeningDispute;	
	
	@Element(name = "OptInStatus")
	@Order(value=1)
	public Boolean optInStatus;	
	
	@Element(name = "AutoRelist")
	@Order(value=2)
	public Boolean autoRelist;	
	
	@Element(name = "RemoveAllExcludedUsers")
	@Order(value=3)
	public Boolean removeAllExcludedUsers;	
	
	@Element(name = "ExcludedUser")
	@Order(value=4)
	public List<String> excludedUser;	
	
	@Element(name = "AutoOptDonationRefund")
	@Order(value=5)
	public Boolean autoOptDonationRefund;	
	
	@AnyElement
	@Order(value=6)
	public List<Object> any;	
	
    
}