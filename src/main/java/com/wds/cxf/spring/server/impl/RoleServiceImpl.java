package com.wds.cxf.spring.server.impl;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.wds.cxf.spring.server.IRoleService;

@WebService(endpointInterface="com.wds.cxf.spring.server.IRoleService",serviceName="RoleService")
@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING)
public class RoleServiceImpl implements IRoleService {

	@Override
	public Map<String, List<String>> getRoleName() {
		return null;
	}

}
