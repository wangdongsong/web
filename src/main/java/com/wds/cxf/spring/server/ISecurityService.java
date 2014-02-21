package com.wds.cxf.spring.server;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.wds.cxf.spring.server.adapter.MappingUser;

@WebService
public interface ISecurityService {
	@XmlJavaTypeAdapter(value=MappingUser.class)
	public Map<String, List<User>> getAuthority();
}
