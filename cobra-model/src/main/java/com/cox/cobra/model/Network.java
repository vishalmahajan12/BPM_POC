package com.cox.cobra.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Network")
@XmlAccessorType(XmlAccessType.FIELD)
public class Network implements Serializable {
	private static final long serialVersionUID = -3498432046483366147L;
	private Integer channelLineupNumber;
	private Integer cluDetailKey;
	private Integer programmerNetworkKey;
	private String programCostCode;
	private String subscriberCategory;
	private String subscriberType;
	private String freeType;
	private Long channelLineupKey;
	private Float alternateEBU;
	private Float standardEBU;
	private Float discountFloor;
	private Float percUnits;
	private Float revenue;
	private Float standardResidentialRetailRate;
	private String networkRuleAppliedFlag;
	private Float derivedBilledAmount;
	private Float derivedResidentialRetailRate;

	/**
	 * @return the channelLineupNumber
	 */
	public Integer getChannelLineupNumber() {
		return channelLineupNumber;
	}

	/**
	 * @param channelLineupNumber
	 *            the channelLineupNumber to set
	 */
	public void setChannelLineupNumber(Integer channelLineupNumber) {
		this.channelLineupNumber = channelLineupNumber;
	}

	/**
	 * @return the cluDetailKey
	 */
	public Integer getCluDetailKey() {
		return cluDetailKey;
	}

	/**
	 * @param cluDetailKey
	 *            the cluDetailKey to set
	 */
	public void setCluDetailKey(Integer cluDetailKey) {
		this.cluDetailKey = cluDetailKey;
	}

	/**
	 * @return the programmerNetworkKey
	 */
	public Integer getProgrammerNetworkKey() {
		return programmerNetworkKey;
	}

	/**
	 * @param programmerNetworkKey
	 *            the programmerNetworkKey to set
	 */
	public void setProgrammerNetworkKey(Integer programmerNetworkKey) {
		this.programmerNetworkKey = programmerNetworkKey;
	}

	/**
	 * @return the programCostCode
	 */
	public String getProgramCostCode() {
		return programCostCode;
	}

	/**
	 * @param programCostCode
	 *            the programCostCode to set
	 */
	public void setProgramCostCode(String programCostCode) {
		this.programCostCode = programCostCode;
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
	 * @return the channelLineupKey
	 */
	public Long getChannelLineupKey() {
		return channelLineupKey;
	}

	/**
	 * @param channelLineupKey
	 *            the channelLineupKey to set
	 */
	public void setChannelLineupKey(Long channelLineupKey) {
		this.channelLineupKey = channelLineupKey;
	}

	/**
	 * @return the alternateEBU
	 */
	public Float getAlternateEBU() {
		return alternateEBU;
	}

	/**
	 * @param alternateEBU
	 *            the alternateEBU to set
	 */
	public void setAlternateEBU(Float alternateEBU) {
		this.alternateEBU = alternateEBU;
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
	 * @return the discountFloor
	 */
	public Float getDiscountFloor() {
		return discountFloor;
	}

	/**
	 * @param discountFloor
	 *            the discountFloor to set
	 */
	public void setDiscountFloor(Float discountFloor) {
		this.discountFloor = discountFloor;
	}

	/**
	 * @return the percUnits
	 */
	public Float getPercUnits() {
		return percUnits;
	}

	/**
	 * @param percUnits
	 *            the percUnits to set
	 */
	public void setPercUnits(Float percUnits) {
		this.percUnits = percUnits;
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
	 * @return the networkRuleAppliedFlag
	 */
	public String getNetworkRuleAppliedFlag() {
		return networkRuleAppliedFlag;
	}

	/**
	 * @param networkRuleAppliedFlag
	 *            the networkRuleAppliedFlag to set
	 */
	public void setNetworkRuleAppliedFlag(String networkRuleAppliedFlag) {
		this.networkRuleAppliedFlag = networkRuleAppliedFlag;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Network [programCostCode=");
		builder.append(programCostCode);
		builder.append(", subscriberCategory=");
		builder.append(subscriberCategory);
		builder.append(", networkRuleAppliedFlag=");
		builder.append(networkRuleAppliedFlag);
		builder.append("]");
		return builder.toString();
	}
}
