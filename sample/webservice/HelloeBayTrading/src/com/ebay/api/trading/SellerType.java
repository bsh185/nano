// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Information about a user returned in the context of an item's seller.
 * 
 */
public class SellerType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaisaPayStatus")
	@Order(value=0)
	public Integer paisaPayStatus;	
	
	@Element(name = "AllowPaymentEdit")
	@Order(value=1)
	public boolean allowPaymentEdit;	
	
	@Element(name = "BillingCurrency")
	@Order(value=2)
	public CurrencyCodeType billingCurrency;	
	
	@Element(name = "CheckoutEnabled")
	@Order(value=3)
	public boolean checkoutEnabled;	
	
	@Element(name = "CIPBankAccountStored")
	@Order(value=4)
	public boolean cipBankAccountStored;	
	
	@Element(name = "GoodStanding")
	@Order(value=5)
	public boolean goodStanding;	
	
	@Element(name = "MerchandizingPref")
	@Order(value=6)
	public MerchandizingPrefCodeType merchandizingPref;	
	
	@Element(name = "QualifiesForB2BVAT")
	@Order(value=7)
	public boolean qualifiesForB2BVAT;	
	
	@Element(name = "SellerGuaranteeLevel")
	@Order(value=8)
	public SellerGuaranteeLevelCodeType sellerGuaranteeLevel;	
	
	@Element(name = "SellerLevel")
	@Order(value=9)
	public SellerLevelCodeType sellerLevel;	
	
	@Element(name = "SellerPaymentAddress")
	@Order(value=10)
	public AddressType sellerPaymentAddress;	
	
	@Element(name = "SchedulingInfo")
	@Order(value=11)
	public SchedulingInfoType schedulingInfo;	
	
	@Element(name = "StoreOwner")
	@Order(value=12)
	public boolean storeOwner;	
	
	@Element(name = "StoreURL")
	@Order(value=13)
	public String storeURL;	
	
	@Element(name = "SellerBusinessType")
	@Order(value=14)
	public SellerBusinessCodeType sellerBusinessType;	
	
	@Element(name = "RegisteredBusinessSeller")
	@Order(value=15)
	public Boolean registeredBusinessSeller;	
	
	@Element(name = "StoreSite")
	@Order(value=16)
	public SiteCodeType storeSite;	
	
	@Element(name = "PaymentMethod")
	@Order(value=17)
	public SellerPaymentMethodCodeType paymentMethod;	
	
	@Element(name = "ProStoresPreference")
	@Order(value=18)
	public ProStoresCheckoutPreferenceType proStoresPreference;	
	
	@Element(name = "CharityRegistered")
	@Order(value=19)
	public Boolean charityRegistered;	
	
	@Element(name = "SafePaymentExempt")
	@Order(value=20)
	public Boolean safePaymentExempt;	
	
	@Element(name = "PaisaPayEscrowEMIStatus")
	@Order(value=21)
	public Integer paisaPayEscrowEMIStatus;	
	
	@Element(name = "CharityAffiliationDetails")
	@Order(value=22)
	public CharityAffiliationDetailsType charityAffiliationDetails;	
	
	@Element(name = "TransactionPercent")
	@Order(value=23)
	public Float transactionPercent;	
	
	@Element(name = "IntegratedMerchantCreditCardInfo")
	@Order(value=24)
	public IntegratedMerchantCreditCardInfoType integratedMerchantCreditCardInfo;	
	
	@Element(name = "FeatureEligibility")
	@Order(value=25)
	public FeatureEligibilityType featureEligibility;	
	
	@Element(name = "TopRatedSeller")
	@Order(value=26)
	public Boolean topRatedSeller;	
	
	@Element(name = "TopRatedSellerDetails")
	@Order(value=27)
	public TopRatedSellerDetailsType topRatedSellerDetails;	
	
	@Element(name = "RecoupmentPolicyConsent")
	@Order(value=28)
	public RecoupmentPolicyConsentType recoupmentPolicyConsent;	
	
	@Element(name = "DomesticRateTable")
	@Order(value=29)
	public Boolean domesticRateTable;	
	
	@Element(name = "InternationalRateTable")
	@Order(value=30)
	public Boolean internationalRateTable;	
	
	@Element(name = "SellereBayPaymentProcessStatus")
	@Order(value=31)
	public SellereBayPaymentProcessStatusCodeType sellereBayPaymentProcessStatus;	
	
	@Element(name = "SellereBayPaymentProcessConsent")
	@Order(value=32)
	public SellereBayPaymentProcessConsentCodeType sellereBayPaymentProcessConsent;	
	
	@AnyElement
	@Order(value=33)
	public List<Object> any;	
	
    
}