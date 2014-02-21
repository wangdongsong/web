package com.wds.cxf.spring.server;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService
public interface IRoleService {
	public Map<String, List<String>> getRoleName();
}
