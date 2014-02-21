package com.wds.cxf.spring.server.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.wds.cxf.spring.server.User;

public class MappingUser extends XmlAdapter<MappingUserValue, Map<String, List<User>>>{

	@Override
	public Map<String, List<User>> unmarshal(MappingUserValue src)
			throws Exception {
		Map<String, List<User>> target = new HashMap<String, List<User>>();
		for (MappingUserValue.Entry entry : src.getEntries()) {
			target.put(entry.getKey(), entry.getValue());
		}
		return target;
	}

	@Override
	public MappingUserValue marshal(Map<String, List<User>> src) throws Exception {
		MappingUserValue result = new MappingUserValue();
		MappingUserValue.Entry e = null;
		for (Entry<String, List<User>> entry : src.entrySet()) {
			e = new MappingUserValue.Entry();
			e.setKey(entry.getKey());
			e.setValue(entry.getValue());
			result.getEntries().add(e);
		}
		return result;
	}

}
