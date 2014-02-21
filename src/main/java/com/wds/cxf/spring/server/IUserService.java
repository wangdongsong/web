package com.wds.cxf.spring.server;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface IUserService {
	public List<String> getUserName();
}
