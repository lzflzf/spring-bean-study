package com.lizhifeng.study.spring_bean.email;

import com.lizhifeng.study.spring_bean.domain.ICustomer;

public interface EmailInterface {

	public void sendEmail(ICustomer iCustomer);

	public String getFromEmail();
	

	public void setFromEmail(String fromEmail) ;
	

	public String getPassword();

	public void setPassword(String password) ;
	

	public String getSmtpHost() ;
	

	public void setSmtpHost(String smtpHost);
	

	public String getUserId() ;
	

	public void setUserId(String userId);
}
