package com.wds.cxf.spring.server.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.wds.cxf.spring.server.IUserService;

@WebService(endpointInterface="com.wds.cxf.spring.server.IUserService",serviceName="UserService")
@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING)
public class UserServiceImpl implements IUserService {

	@Override
	public List<String> getUserName() {
		List<String> userNameList = new ArrayList<String>();
		
		String userName = "firstName";
		userNameList.add(userName);
		userName = "secondName";
		userNameList.add(userName);
		userName = "thirdName";
		userNameList.add(userName);
		
		return userNameList;
	}

}
