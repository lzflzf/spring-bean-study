package com.lizhifeng.study.spring_bean.creditlinking;

import com.lizhifeng.study.spring_bean.domain.ICustomer;

public interface CreditLinkingInterface {
	
	public String getUrl();
	
	public void setUrl(String url);
	
	public void linkCreditBankAccount(ICustomer icustomer) throws Exception ;

}
