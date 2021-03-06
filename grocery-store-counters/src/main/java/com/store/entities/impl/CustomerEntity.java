package com.store.entities.impl;

import com.store.entities.ICustomerEntity;
import com.store.enums.CustomerTypeEnum;

public class CustomerEntity implements ICustomerEntity {

	private CustomerTypeEnum customerType;
	private int timeArrived;
	private int itemsInHand;

	public CustomerEntity(String customerEntry) {
		String[] records = customerEntry.split(REC_SEPARATOR);
		this.customerType = CustomerTypeEnum.getCustomerTypeEnum(records[0]);
		this.timeArrived = Integer.parseInt(records[1]);
		this.itemsInHand = Integer.parseInt(records[2]);
	}

	public CustomerTypeEnum getCustomerType() {
		return customerType;
	}

	public int getTimeArrived() {
		return timeArrived;
	}

	public int getItemsInHand() {
		return itemsInHand;
	}

	public void billItem() {
		itemsInHand--;
	}

	@Override
	public int compareTo(ICustomerEntity o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Customer Type : " + getCustomerType() 
			+ ", Arrived At : " + getTimeArrived() 
			+ ", With Items : " + getItemsInHand();
	}

}
