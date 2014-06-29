package com.wds.cxf.spring.server.impl;

import javax.jws.WebService;

@WebService
public class NoInterfaceServiceImpl {
	
	public String test(){
		return "Hello, this is test method";
	}
}
