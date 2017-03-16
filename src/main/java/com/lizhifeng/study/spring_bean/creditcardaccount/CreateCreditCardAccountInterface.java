package com.lizhifeng.study.spring_bean.creditcardaccount;

import com.lizhifeng.study.spring_bean.creditlinking.CreditLinkingInterface;
import com.lizhifeng.study.spring_bean.creditrating.CreditRatingInterface;
import com.lizhifeng.study.spring_bean.domain.ICustomer;
import com.lizhifeng.study.spring_bean.email.EmailInterface;

public interface CreateCreditCardAccountInterface {

	public CreditLinkingInterface getCreditLinkingInterface();

	public void setCreditLinkingInterface(
			CreditLinkingInterface creditLinkingInterface);

	public CreditRatingInterface getCreditRatingInterface();

	public void setCreditRatingInterface(
			CreditRatingInterface creditRatingInterface);

	public EmailInterface getEmailInterface();

	public void setEmailInterface(EmailInterface emailInterface);

	public void createCreditCardAccount(ICustomer icustomer) throws Exception;

}
