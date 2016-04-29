package com.cox.cobra.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer implements Serializable {
	private static final long serialVersionUID = 3404206286797170185L;
	private Long key;
	private String typeCode;
	private String typeDesc;
	private String residentialCommercialInd;
	private Integer employeeFlag;
	private String customerCategoryCode;
	private Integer dwellingTypeKey;
	private String dwellingTypeCode;
	private Integer houseKey;
	private Long channelLineupKey;
	private Integer defaultChannelLineupKey;
	private Integer franchiseKey;
	private Integer companyDivisionKey;
	private Integer siteKey;
	private Integer siteId;
	private String siteCode;
	private Integer systemKey;
	private Integer regionKey;
	private Date Time_Key;
	private String developmentNumber;
	@XmlElement(name = "Product")
	@XmlElementWrapper(name = "Products")
	private List<Product> products;

	private boolean approved = true;
	private String derivedProductCode;

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
	 * @return the typeDesc
	 */
	public String getTypeDesc() {
		return typeDesc;
	}

	/**
	 * @param typeDesc
	 *            the typeDesc to set
	 */
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	/**
	 * @return the residentialCommercialInd
	 */
	public String getResidentialCommercialInd() {
		return residentialCommercialInd;
	}

	/**
	 * @param residentialCommercialInd
	 *            the residentialCommercialInd to set
	 */
	public void setResidentialCommercialInd(String residentialCommercialInd) {
		this.residentialCommercialInd = residentialCommercialInd;
	}

	/**
	 * @return the employeeFlag
	 */
	public Integer getEmployeeFlag() {
		return employeeFlag;
	}

	/**
	 * @param employeeFlag
	 *            the employeeFlag to set
	 */
	public void setEmployeeFlag(Integer employeeFlag) {
		this.employeeFlag = employeeFlag;
	}

	/**
	 * @return the customerCategoryCode
	 */
	public String getCustomerCategoryCode() {
		return customerCategoryCode;
	}

	/**
	 * @param customerCategoryCode
	 *            the customerCategoryCode to set
	 */
	public void setCustomerCategoryCode(String customerCategoryCode) {
		this.customerCategoryCode = customerCategoryCode;
	}

	/**
	 * @return the dwellingTypeKey
	 */
	public Integer getDwellingTypeKey() {
		return dwellingTypeKey;
	}

	/**
	 * @param dwellingTypeKey
	 *            the dwellingTypeKey to set
	 */
	public void setDwellingTypeKey(Integer dwellingTypeKey) {
		this.dwellingTypeKey = dwellingTypeKey;
	}

	/**
	 * @return the dwellingTypeCode
	 */
	public String getDwellingTypeCode() {
		return dwellingTypeCode;
	}

	/**
	 * @param dwellingTypeCode
	 *            the dwellingTypeCode to set
	 */
	public void setDwellingTypeCode(String dwellingTypeCode) {
		this.dwellingTypeCode = dwellingTypeCode;
	}

	/**
	 * @return the houseKey
	 */
	public Integer getHouseKey() {
		return houseKey;
	}

	/**
	 * @param houseKey
	 *            the houseKey to set
	 */
	public void setHouseKey(Integer houseKey) {
		this.houseKey = houseKey;
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
	 * @return the defaultChannelLineupKey
	 */
	public Integer getDefaultChannelLineupKey() {
		return defaultChannelLineupKey;
	}

	/**
	 * @param defaultChannelLineupKey
	 *            the defaultChannelLineupKey to set
	 */
	public void setDefaultChannelLineupKey(Integer defaultChannelLineupKey) {
		this.defaultChannelLineupKey = defaultChannelLineupKey;
	}

	/**
	 * @return the franchiseKey
	 */
	public Integer getFranchiseKey() {
		return franchiseKey;
	}

	/**
	 * @param franchiseKey
	 *            the franchiseKey to set
	 */
	public void setFranchiseKey(Integer franchiseKey) {
		this.franchiseKey = franchiseKey;
	}

	/**
	 * @return the companyDivisionKey
	 */
	public Integer getCompanyDivisionKey() {
		return companyDivisionKey;
	}

	/**
	 * @param companyDivisionKey
	 *            the companyDivisionKey to set
	 */
	public void setCompanyDivisionKey(Integer companyDivisionKey) {
		this.companyDivisionKey = companyDivisionKey;
	}

	/**
	 * @return the siteKey
	 */
	public Integer getSiteKey() {
		return siteKey;
	}

	/**
	 * @param siteKey
	 *            the siteKey to set
	 */
	public void setSiteKey(Integer siteKey) {
		this.siteKey = siteKey;
	}

	/**
	 * @return the siteId
	 */
	public Integer getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId
	 *            the siteId to set
	 */
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the siteCode
	 */
	public String getSiteCode() {
		return siteCode;
	}

	/**
	 * @param siteCode
	 *            the siteCode to set
	 */
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	/**
	 * @return the systemKey
	 */
	public Integer getSystemKey() {
		return systemKey;
	}

	/**
	 * @param systemKey
	 *            the systemKey to set
	 */
	public void setSystemKey(Integer systemKey) {
		this.systemKey = systemKey;
	}

	/**
	 * @return the regionKey
	 */
	public Integer getRegionKey() {
		return regionKey;
	}

	/**
	 * @param regionKey
	 *            the regionKey to set
	 */
	public void setRegionKey(Integer regionKey) {
		this.regionKey = regionKey;
	}

	/**
	 * @return the time_Key
	 */
	public Date getTime_Key() {
		return Time_Key;
	}

	/**
	 * @param time_Key
	 *            the time_Key to set
	 */
	public void setTime_Key(Date time_Key) {
		Time_Key = time_Key;
	}

	/**
	 * @return the developmentNumber
	 */
	public String getDevelopmentNumber() {
		return developmentNumber;
	}

	/**
	 * @param developmentNumber
	 *            the developmentNumber to set
	 */
	public void setDevelopmentNumber(String developmentNumber) {
		this.developmentNumber = developmentNumber;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/**
	 * @return the approved
	 */
	public boolean isApproved() {
		return approved;
	}

	public boolean getApproved() {
		return this.approved;
	}

	/**
	 * @param approved
	 *            the approved to set
	 */
	public void setApproved(boolean approved) {
		this.approved = approved;
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

	public boolean hasAllProducts(String productsStr) {
		if (products == null || products.size() == 0) {
			return false;
		}
		String[] inputProducts = productsStr.split(",");
		for (String inputProduct : inputProducts) {
			if (!products.contains(new Product(inputProduct))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkExistingProduct(Product derivedProd) {
		for (Product prod : products) {
			if (prod.getKey() == derivedProd.getKey()
					&& derivedProd.getCustSvcOccurrenceNbr().equals(prod.getCustSvcOccurrenceNbr())
					&& derivedProd.getDerivedProductCode().equals(prod.getDerivedProductCode())) {
				return true;
			}
		}
		return false;
	}

	public void setInheritedProductProperties(String prodCode) {
		List<Product> derivedProds = new ArrayList<Product>();
		for (Product prod : products) {
			if (prod.getCode().equals(prodCode)) {
				Product derivedProd = new Product();
				derivedProd.setDerivedProductCode(derivedProductCode);
				derivedProd.setDerivedProduct(true);
				derivedProd.setCode(derivedProductCode);
				derivedProd.setKey(0l);
				if (prod.getCustSvcOccurrenceNbr() != null) {
					derivedProd.setCustSvcOccurrenceNbr(prod.getCustSvcOccurrenceNbr());
				}
				if (prod.getKey() != null) {
					derivedProd.setKey(prod.getKey());
				}
				if (!checkExistingProduct(derivedProd)) {
					// ...
				}
				derivedProds.add(derivedProd);
			}
		}
		getProducts().addAll(derivedProds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [key=");
		builder.append(key);
		builder.append(", siteId=");
		builder.append(siteId);
		builder.append(", products=");
		builder.append(products);
		builder.append("]");
		return builder.toString();
	}
}
