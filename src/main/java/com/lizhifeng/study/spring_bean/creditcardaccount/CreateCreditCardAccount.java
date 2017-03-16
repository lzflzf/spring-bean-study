package com.lizhifeng.study.spring_bean.creditcardaccount;

import com.lizhifeng.study.spring_bean.creditlinking.CreditLinkingInterface;
import com.lizhifeng.study.spring_bean.creditrating.CreditRatingInterface;
import com.lizhifeng.study.spring_bean.domain.ICustomer;
import com.lizhifeng.study.spring_bean.email.EmailInterface;

public class CreateCreditCardAccount implements CreateCreditCardAccountInterface {

	
	private CreditLinkingInterface creditLinkingInterface;
	private CreditRatingInterface creditRatingInterface;
	private EmailInterface emailInterface;
	
	public void createCreditCardAccount(ICustomer icustomer) throws Exception{
		boolean crediRating = getCreditRatingInterface().getUserCreditHistoryInformation(icustomer);
		icustomer.setCreditRating(crediRating);
		//Good Rating
		if(crediRating){
			getCreditLinkingInterface().linkCreditBankAccount(icustomer);
		}
		
		getEmailInterface().sendEmail(icustomer);
				
	}

	public CreditLinkingInterface getCreditLinkingInterface() {
		return creditLinkingInterface;
	}
	

	public void setCreditLinkingInterface(
			CreditLinkingInterface creditLinkingInterface) {
			// 使用bean 进行初始化
		this.creditLinkingInterface = creditLinkingInterface;
		System.out.println("初始化creditLinkingInterface");
	}
	

	public CreditRatingInterface getCreditRatingInterface() {
		return creditRatingInterface;
	}
	

	public void setCreditRatingInterface(CreditRatingInterface creditRatingInterface) {
		this.creditRatingInterface = creditRatingInterface;
		System.out.println("初始化creditRatingInterface");
	}
	

	public EmailInterface getEmailInterface() {
		return emailInterface;
	}
	

	public void setEmailInterface(EmailInterface emailInterface) {
		this.emailInterface = emailInterface;
		System.out.println("初始化emailInterface");
	}
		
}
