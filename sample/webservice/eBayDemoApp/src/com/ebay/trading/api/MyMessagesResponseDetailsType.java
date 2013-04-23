// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Details relating to the response to a message.
 * 
 */
public class MyMessagesResponseDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ResponseEnabled")
	@Order(value=0)
	public Boolean responseEnabled;	
	
	@Element(name = "ResponseURL")
	@Order(value=1)
	public String responseURL;	
	
	@Element(name = "UserResponseDate")
	@Order(value=2)
	public Date userResponseDate;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}