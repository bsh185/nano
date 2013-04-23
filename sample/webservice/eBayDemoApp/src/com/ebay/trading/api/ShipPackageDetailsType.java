// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Details pertinent to one or more items for which
 * calculated shipping (or flat rate shipping using shipping rate tables with
 * weight surcharges) has been offered by the seller, such as package
 * dimension and weight and packaging/handling costs. Also returned
 * with the data for an item's transaction.
 * 
 */
public class ShipPackageDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MeasurementUnit")
	@Order(value=0)
	public MeasurementSystemCodeType measurementUnit;	
	
	@Element(name = "PackageDepth")
	@Order(value=1)
	public MeasureType packageDepth;	
	
	@Element(name = "PackageLength")
	@Order(value=2)
	public MeasureType packageLength;	
	
	@Element(name = "PackageWidth")
	@Order(value=3)
	public MeasureType packageWidth;	
	
	@Element(name = "ShippingIrregular")
	@Order(value=4)
	public Boolean shippingIrregular;	
	
	@Element(name = "ShippingPackage")
	@Order(value=5)
	public ShippingPackageCodeType shippingPackage;	
	
	@Element(name = "WeightMajor")
	@Order(value=6)
	public MeasureType weightMajor;	
	
	@Element(name = "WeightMinor")
	@Order(value=7)
	public MeasureType weightMinor;	
	
	@AnyElement
	@Order(value=8)
	public List<Object> any;	
	
    
}