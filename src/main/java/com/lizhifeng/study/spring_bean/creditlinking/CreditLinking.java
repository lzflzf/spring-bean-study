package com.lizhifeng.study.spring_bean.creditlinking;

import com.lizhifeng.study.spring_bean.domain.ICustomer;

public class CreditLinking implements CreditLinkingInterface {

	private String url;
	
	public void linkCreditBankAccount(ICustomer icustomer) throws Exception {
		//Connect to URL
		System.out.println("url to connect is " + url);		
		System.out.println("credit card linked for customer id " + icustomer.getCustomerId());
	}

	public String getUrl() {
		return url;
	}
	

	public void setUrl(String url) {
		this.url = url;
		System.out.println("初始化url");		
	}
}
