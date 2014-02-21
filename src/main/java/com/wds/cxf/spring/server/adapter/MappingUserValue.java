package com.wds.cxf.spring.server.adapter;

import java.util.ArrayList;
import java.util.List;

import com.wds.cxf.spring.server.User;

public class MappingUserValue {
	private List<Entry> entries = new ArrayList<MappingUserValue.Entry>();

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	public static class Entry {
		private String key;
		private List<User> value;

		public List<User> getValue() {
			return value;
		}

		public void setValue(List<User> value) {
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

	}

}