package com.tutorialspoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List AddressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	/**
	 * @return the addressList
	 */
	public List getAddressList() {
		System.out.println("List elements : " + this.AddressList);
		return AddressList;
	}
	/**
	 * @param addressList the addressList to set
	 */
	public void setAddressList(List addressList) {
		AddressList = addressList;
	}
	/**
	 * @return the addressSet
	 */
	public Set getAddressSet() {
		System.out.println("Set Elements : " + this.addressSet);
		return addressSet;
	}
	/**
	 * @param addressSet the addressSet to set
	 */
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	/**
	 * @return the addressMap
	 */
	public Map getAddressMap() {
		System.out.println("Map Elements : " + this.addressMap);
		return addressMap;
	}
	/**
	 * @param addressMap the addressMap to set
	 */
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	/**
	 * @return the addressProp
	 */
	public Properties getAddressProp() {
		System.out.println("Properties Elements : " + this.addressProp);
		return addressProp;
	}
	/**
	 * @param addressProp the addressProp to set
	 */
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
	
}
