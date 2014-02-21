package com.wds.cxf.spring.server.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wds.cxf.spring.server.ISecurityService;
import com.wds.cxf.spring.server.User;

public class SecurityServiceImpl implements ISecurityService {

	@Override
	public Map<String, List<User>> getAuthority() {
		Map<String, List<User>> result = new HashMap<String, List<User>>();
		User u = null;
		List<User> users = new ArrayList<User>(10);
		String key = "seriail1";
		for (int i = 0; i < 10; i++) {
			u = new User("name" + i, "code--" + i);
			users.add(u);
		}
		result.put(key, users);
		
		users = new ArrayList<User>(10);
		key = "seriail2";
		for (int i = 20; i < 30; i++) {
			u = new User("name" + i, "code--" + i);
			users.add(u);
		}
		result.put(key, users);
		
		return result;
	}

}
