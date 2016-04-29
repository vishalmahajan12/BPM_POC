package com.cox.cobra.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable {
	private static final long serialVersionUID = -1231706169313590667L;
	private Long key;
	private String code;
	private String lineCode;
	private String groupCode;
	private String categoryCode;
	private String typeCode;
	private String serviceType;
	private String deliveryMechanism;
	private Integer outletTypeKey;
	private String outletTypeCode;
	private Integer billTypeKey;
	private String billTypeCode;
	private Integer serviceStatusKey;
	private String checkedInStatusCode;
	private String serviceStatusCode;
	private Integer campaignKey;
	private String seasonalFlag;
	private Integer serviceQuantity;
	private Integer freeServiceQuantity;
	private Integer billedServiceQuantity;
	private Integer custSvcOccurrenceNbr;
	private Integer siteProductCount;
	private Float residentialRetailRate;
	private Float retailRate;
	private Float retailAmount;
	private Float billedRate;
	private Float billedAmount;
	private Float discountAmount;
	private String freeFlag;
	private Integer occupiedUnits;
	private String derivedProductCode;
	private String subscriberCategory;
	private String subscriberType;
	private String freeType;
	private Float standardEBU;
	private String barRestaurantFlag;
	private Float revenue;
	private Float standardResidentialRetailRate;
	private boolean derivedProduct;
	private Integer derivedServiceQuantity;
	private Integer derivedFreeServiceQuantity;
	private Integer derivedBilledServiceQuantity;
	private Float derivedResidentialRetailRate;
	private Float derivedRetailRate;
	private Float derivedRetailAmount;
	private Float derivedBilledRate;
	private Float derivedBilledAmount;
	private Float derivedDiscountAmount;
	private String seasonalSubscriberFlag;
	private String overrideOutletTypeCode;
	private String overrideBillTypeCode;
	private String overrideCheckedInStatusCode;
	private String overrideServiceStatusCode;

	@XmlElement(name = "Network")
	@XmlElementWrapper(name = "Networks")
	private List<Network> networks;

	public Product() {
	}

	public Product(String code) {
		this.code = code;
	}

	/**
	 * @return the key
	 */
	public Long getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(Long key) {
		this.key = key;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the lineCode
	 */
	public String getLineCode() {
		return lineCode;
	}

	/**
	 * @param lineCode
	 *            the lineCode to set
	 */
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	/**
	 * @return the groupCode
	 */
	public String getGroupCode() {
		return groupCode;
	}

	/**
	 * @param groupCode
	 *            the groupCode to set
	 */
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	/**
	 * @return the categoryCode
	 */
	public String getCategoryCode() {
		return categoryCode;
	}

	/**
	 * @param categoryCode
	 *            the categoryCode to set
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * @return the typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * @param typeCode
	 *            the typeCode to set
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the deliveryMechanism
	 */
	public String getDeliveryMechanism() {
		return deliveryMechanism;
	}

	/**
	 * @param deliveryMechanism
	 *            the deliveryMechanism to set
	 */
	public void setDeliveryMechanism(String deliveryMechanism) {
		this.deliveryMechanism = deliveryMechanism;
	}

	/**
	 * @return the outletTypeKey
	 */
	public Integer getOutletTypeKey() {
		return outletTypeKey;
	}

	/**
	 * @param outletTypeKey
	 *            the outletTypeKey to set
	 */
	public void setOutletTypeKey(Integer outletTypeKey) {
		this.outletTypeKey = outletTypeKey;
	}

	/**
	 * @return the outletTypeCode
	 */
	public String getOutletTypeCode() {
		return outletTypeCode;
	}

	/**
	 * @param outletTypeCode
	 *            the outletTypeCode to set
	 */
	public void setOutletTypeCode(String outletTypeCode) {
		this.outletTypeCode = outletTypeCode;
	}

	/**
	 * @return the billTypeKey
	 */
	public Integer getBillTypeKey() {
		return billTypeKey;
	}

	/**
	 * @param billTypeKey
	 *            the billTypeKey to set
	 */
	public void setBillTypeKey(Integer billTypeKey) {
		this.billTypeKey = billTypeKey;
	}

	/**
	 * @return the billTypeCode
	 */
	public String getBillTypeCode() {
		return billTypeCode;
	}

	/**
	 * @param billTypeCode
	 *            the billTypeCode to set
	 */
	public void setBillTypeCode(String billTypeCode) {
		this.billTypeCode = billTypeCode;
	}

	/**
	 * @return the serviceStatusKey
	 */
	public Integer getServiceStatusKey() {
		return serviceStatusKey;
	}

	/**
	 * @param serviceStatusKey
	 *            the serviceStatusKey to set
	 */
	public void setServiceStatusKey(Integer serviceStatusKey) {
		this.serviceStatusKey = serviceStatusKey;
	}

	/**
	 * @return the checkedInStatusCode
	 */
	public String getCheckedInStatusCode() {
		return checkedInStatusCode;
	}

	/**
	 * @param checkedInStatusCode
	 *            the checkedInStatusCode to set
	 */
	public void setCheckedInStatusCode(String checkedInStatusCode) {
		this.checkedInStatusCode = checkedInStatusCode;
	}

	/**
	 * @return the serviceStatusCode
	 */
	public String getServiceStatusCode() {
		return serviceStatusCode;
	}

	/**
	 * @param serviceStatusCode
	 *            the serviceStatusCode to set
	 */
	public void setServiceStatusCode(String serviceStatusCode) {
		this.serviceStatusCode = serviceStatusCode;
	}

	/**
	 * @return the campaignKey
	 */
	public Integer getCampaignKey() {
		return campaignKey;
	}

	/**
	 * @param campaignKey
	 *            the campaignKey to set
	 */
	public void setCampaignKey(Integer campaignKey) {
		this.campaignKey = campaignKey;
	}

	/**
	 * @return the seasonalFlag
	 */
	public String getSeasonalFlag() {
		return seasonalFlag;
	}

	/**
	 * @param seasonalFlag
	 *            the seasonalFlag to set
	 */
	public void setSeasonalFlag(String seasonalFlag) {
		this.seasonalFlag = seasonalFlag;
	}

	/**
	 * @return the serviceQuantity
	 */
	public Integer getServiceQuantity() {
		return serviceQuantity;
	}

	/**
	 * @param serviceQuantity
	 *            the serviceQuantity to set
	 */
	public void setServiceQuantity(Integer serviceQuantity) {
		this.serviceQuantity = serviceQuantity;
	}

	/**
	 * @return the freeServiceQuantity
	 */
	public Integer getFreeServiceQuantity() {
		return freeServiceQuantity;
	}

	/**
	 * @param freeServiceQuantity
	 *            the freeServiceQuantity to set
	 */
	public void setFreeServiceQuantity(Integer freeServiceQuantity) {
		this.freeServiceQuantity = freeServiceQuantity;
	}

	/**
	 * @return the billedServiceQuantity
	 */
	public Integer getBilledServiceQuantity() {
		return billedServiceQuantity;
	}

	/**
	 * @param billedServiceQuantity
	 *            the billedServiceQuantity to set
	 */
	public void setBilledServiceQuantity(Integer billedServiceQuantity) {
		this.billedServiceQuantity = billedServiceQuantity;
	}

	/**
	 * @return the custSvcOccurrenceNbr
	 */
	public Integer getCustSvcOccurrenceNbr() {
		return custSvcOccurrenceNbr;
	}

	/**
	 * @param custSvcOccurrenceNbr
	 *            the custSvcOccurrenceNbr to set
	 */
	public void setCustSvcOccurrenceNbr(Integer custSvcOccurrenceNbr) {
		this.custSvcOccurrenceNbr = custSvcOccurrenceNbr;
	}

	/**
	 * @return the siteProductCount
	 */
	public Integer getSiteProductCount() {
		return siteProductCount;
	}

	/**
	 * @param siteProductCount
	 *            the siteProductCount to set
	 */
	public void setSiteProductCount(Integer siteProductCount) {
		this.siteProductCount = siteProductCount;
	}

	/**
	 * @return the residentialRetailRate
	 */
	public Float getResidentialRetailRate() {
		return residentialRetailRate;
	}

	/**
	 * @param residentialRetailRate
	 *            the residentialRetailRate to set
	 */
	public void setResidentialRetailRate(Float residentialRetailRate) {
		this.residentialRetailRate = residentialRetailRate;
	}

	/**
	 * @return the retailRate
	 */
	public Float getRetailRate() {
		return retailRate;
	}

	/**
	 * @param retailRate
	 *            the retailRate to set
	 */
	public void setRetailRate(Float retailRate) {
		this.retailRate = retailRate;
	}

	/**
	 * @return the retailAmount
	 */
	public Float getRetailAmount() {
		return retailAmount;
	}

	/**
	 * @param retailAmount
	 *            the retailAmount to set
	 */
	public void setRetailAmount(Float retailAmount) {
		this.retailAmount = retailAmount;
	}

	/**
	 * @return the billedRate
	 */
	public Float getBilledRate() {
		return billedRate;
	}

	/**
	 * @param billedRate
	 *            the billedRate to set
	 */
	public void setBilledRate(Float billedRate) {
		this.billedRate = billedRate;
	}

	/**
	 * @return the billedAmount
	 */
	public Float getBilledAmount() {
		return billedAmount;
	}

	/**
	 * @param billedAmount
	 *            the billedAmount to set
	 */
	public void setBilledAmount(Float billedAmount) {
		this.billedAmount = billedAmount;
	}

	/**
	 * @return the discountAmount
	 */
	public Float getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * @param discountAmount
	 *            the discountAmount to set
	 */
	public void setDiscountAmount(Float discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * @return the freeFlag
	 */
	public String getFreeFlag() {
		return freeFlag;
	}

	/**
	 * @param freeFlag
	 *            the freeFlag to set
	 */
	public void setFreeFlag(String freeFlag) {
		this.freeFlag = freeFlag;
	}

	/**
	 * @return the occupiedUnits
	 */
	public Integer getOccupiedUnits() {
		return occupiedUnits;
	}

	/**
	 * @param occupiedUnits
	 *            the occupiedUnits to set
	 */
	public void setOccupiedUnits(Integer occupiedUnits) {
		this.occupiedUnits = occupiedUnits;
	}

	/**
	 * @return the derivedProductCode
	 */
	public String getDerivedProductCode() {
		return derivedProductCode;
	}

	/**
	 * @param derivedProductCode
	 *            the derivedProductCode to set
	 */
	public void setDerivedProductCode(String derivedProductCode) {
		this.derivedProductCode = derivedProductCode;
	}

	/**
	 * @return the subscriberCategory
	 */
	public String getSubscriberCategory() {
		return subscriberCategory;
	}

	/**
	 * @param subscriberCategory
	 *            the subscriberCategory to set
	 */
	public void setSubscriberCategory(String subscriberCategory) {
		this.subscriberCategory = subscriberCategory;
	}

	/**
	 * @return the subscriberType
	 */
	public String getSubscriberType() {
		return subscriberType;
	}

	/**
	 * @param subscriberType
	 *            the subscriberType to set
	 */
	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
	}

	/**
	 * @return the freeType
	 */
	public String getFreeType() {
		return freeType;
	}

	/**
	 * @param freeType
	 *            the freeType to set
	 */
	public void setFreeType(String freeType) {
		this.freeType = freeType;
	}

	/**
	 * @return the standardEBU
	 */
	public Float getStandardEBU() {
		return standardEBU;
	}

	/**
	 * @param standardEBU
	 *            the standardEBU to set
	 */
	public void setStandardEBU(Float standardEBU) {
		this.standardEBU = standardEBU;
	}

	/**
	 * @return the barRestaurantFlag
	 */
	public String getBarRestaurantFlag() {
		return barRestaurantFlag;
	}

	/**
	 * @param barRestaurantFlag
	 *            the barRestaurantFlag to set
	 */
	public void setBarRestaurantFlag(String barRestaurantFlag) {
		this.barRestaurantFlag = barRestaurantFlag;
	}

	/**
	 * @return the revenue
	 */
	public Float getRevenue() {
		return revenue;
	}

	/**
	 * @param revenue
	 *            the revenue to set
	 */
	public void setRevenue(Float revenue) {
		this.revenue = revenue;
	}

	/**
	 * @return the standardResidentialRetailRate
	 */
	public Float getStandardResidentialRetailRate() {
		return standardResidentialRetailRate;
	}

	/**
	 * @param standardResidentialRetailRate
	 *            the standardResidentialRetailRate to set
	 */
	public void setStandardResidentialRetailRate(Float standardResidentialRetailRate) {
		this.standardResidentialRetailRate = standardResidentialRetailRate;
	}

	/**
	 * @return the derivedProduct
	 */
	public boolean isDerivedProduct() {
		return derivedProduct;
	}

	/**
	 * @param derivedProduct
	 *            the derivedProduct to set
	 */
	public void setDerivedProduct(boolean derivedProduct) {
		this.derivedProduct = derivedProduct;
	}

	/**
	 * @return the derivedServiceQuantity
	 */
	public Integer getDerivedServiceQuantity() {
		return derivedServiceQuantity;
	}

	/**
	 * @param derivedServiceQuantity
	 *            the derivedServiceQuantity to set
	 */
	public void setDerivedServiceQuantity(Integer derivedServiceQuantity) {
		this.derivedServiceQuantity = derivedServiceQuantity;
	}

	/**
	 * @return the derivedFreeServiceQuantity
	 */
	public Integer getDerivedFreeServiceQuantity() {
		return derivedFreeServiceQuantity;
	}

	/**
	 * @param derivedFreeServiceQuantity
	 *            the derivedFreeServiceQuantity to set
	 */
	public void setDerivedFreeServiceQuantity(Integer derivedFreeServiceQuantity) {
		this.derivedFreeServiceQuantity = derivedFreeServiceQuantity;
	}

	/**
	 * @return the derivedBilledServiceQuantity
	 */
	public Integer getDerivedBilledServiceQuantity() {
		return derivedBilledServiceQuantity;
	}

	/**
	 * @param derivedBilledServiceQuantity
	 *            the derivedBilledServiceQuantity to set
	 */
	public void setDerivedBilledServiceQuantity(Integer derivedBilledServiceQuantity) {
		this.derivedBilledServiceQuantity = derivedBilledServiceQuantity;
	}

	/**
	 * @return the derivedResidentialRetailRate
	 */
	public Float getDerivedResidentialRetailRate() {
		return derivedResidentialRetailRate;
	}

	/**
	 * @param derivedResidentialRetailRate
	 *            the derivedResidentialRetailRate to set
	 */
	public void setDerivedResidentialRetailRate(Float derivedResidentialRetailRate) {
		this.derivedResidentialRetailRate = derivedResidentialRetailRate;
	}

	/**
	 * @return the derivedRetailRate
	 */
	public Float getDerivedRetailRate() {
		return derivedRetailRate;
	}

	/**
	 * @param derivedRetailRate
	 *            the derivedRetailRate to set
	 */
	public void setDerivedRetailRate(Float derivedRetailRate) {
		this.derivedRetailRate = derivedRetailRate;
	}

	/**
	 * @return the derivedRetailAmount
	 */
	public Float getDerivedRetailAmount() {
		return derivedRetailAmount;
	}

	/**
	 * @param derivedRetailAmount
	 *            the derivedRetailAmount to set
	 */
	public void setDerivedRetailAmount(Float derivedRetailAmount) {
		this.derivedRetailAmount = derivedRetailAmount;
	}

	/**
	 * @return the derivedBilledRate
	 */
	public Float getDerivedBilledRate() {
		return derivedBilledRate;
	}

	/**
	 * @param derivedBilledRate
	 *            the derivedBilledRate to set
	 */
	public void setDerivedBilledRate(Float derivedBilledRate) {
		this.derivedBilledRate = derivedBilledRate;
	}

	/**
	 * @return the derivedBilledAmount
	 */
	public Float getDerivedBilledAmount() {
		return derivedBilledAmount;
	}

	/**
	 * @param derivedBilledAmount
	 *            the derivedBilledAmount to set
	 */
	public void setDerivedBilledAmount(Float derivedBilledAmount) {
		this.derivedBilledAmount = derivedBilledAmount;
	}

	/**
	 * @return the derivedDiscountAmount
	 */
	public Float getDerivedDiscountAmount() {
		return derivedDiscountAmount;
	}

	/**
	 * @param derivedDiscountAmount
	 *            the derivedDiscountAmount to set
	 */
	public void setDerivedDiscountAmount(Float derivedDiscountAmount) {
		this.derivedDiscountAmount = derivedDiscountAmount;
	}

	/**
	 * @return the seasonalSubscriberFlag
	 */
	public String getSeasonalSubscriberFlag() {
		return seasonalSubscriberFlag;
	}

	/**
	 * @param seasonalSubscriberFlag
	 *            the seasonalSubscriberFlag to set
	 */
	public void setSeasonalSubscriberFlag(String seasonalSubscriberFlag) {
		this.seasonalSubscriberFlag = seasonalSubscriberFlag;
	}

	/**
	 * @return the overrideOutletTypeCode
	 */
	public String getOverrideOutletTypeCode() {
		return overrideOutletTypeCode;
	}

	/**
	 * @param overrideOutletTypeCode
	 *            the overrideOutletTypeCode to set
	 */
	public void setOverrideOutletTypeCode(String overrideOutletTypeCode) {
		this.overrideOutletTypeCode = overrideOutletTypeCode;
	}

	/**
	 * @return the overrideBillTypeCode
	 */
	public String getOverrideBillTypeCode() {
		return overrideBillTypeCode;
	}

	/**
	 * @param overrideBillTypeCode
	 *            the overrideBillTypeCode to set
	 */
	public void setOverrideBillTypeCode(String overrideBillTypeCode) {
		this.overrideBillTypeCode = overrideBillTypeCode;
	}

	/**
	 * @return the overrideCheckedInStatusCode
	 */
	public String getOverrideCheckedInStatusCode() {
		return overrideCheckedInStatusCode;
	}

	/**
	 * @param overrideCheckedInStatusCode
	 *            the overrideCheckedInStatusCode to set
	 */
	public void setOverrideCheckedInStatusCode(String overrideCheckedInStatusCode) {
		this.overrideCheckedInStatusCode = overrideCheckedInStatusCode;
	}

	/**
	 * @return the overrideServiceStatusCode
	 */
	public String getOverrideServiceStatusCode() {
		return overrideServiceStatusCode;
	}

	/**
	 * @param overrideServiceStatusCode
	 *            the overrideServiceStatusCode to set
	 */
	public void setOverrideServiceStatusCode(String overrideServiceStatusCode) {
		this.overrideServiceStatusCode = overrideServiceStatusCode;
	}

	/**
	 * @return the networks
	 */
	public List<Network> getNetworks() {
		return networks;
	}

	/**
	 * @param networks
	 *            the networks to set
	 */
	public void setNetworks(List<Network> networks) {
		this.networks = networks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [code=");
		builder.append(code);
		builder.append(", subscriberCategory=");
		builder.append(subscriberCategory);
		builder.append(", networks=");
		builder.append(networks);
		builder.append("]");
		return builder.toString();
	}
}
