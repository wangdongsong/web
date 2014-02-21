package com.wds.cxf.spring.server.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class HeaderHandlerInterceptor extends AbstractPhaseInterceptor<Message> {

	public HeaderHandlerInterceptor(String phase) {
		super(Phase.PRE_INVOKE);
	}
	
	public HeaderHandlerInterceptor() {
		this(null);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		SoapMessage msg = (SoapMessage)message;
		List<Header> headers = msg.getHeaders();
		
		if(headers == null || headers.size() < 1){
			throw new Fault(new IllegalArgumentException("There have no header node!"));
		}
		
		Header firstHeader = headers.get(0);
		
		for (Header header : headers) {
			QName qName = header.getName();
			System.out.println(qName);
		}
		
		Element element = (Element)firstHeader.getObject();
		
		NodeList usernameNode = element.getElementsByTagName("username");
		NodeList passwordNode = element.getElementsByTagName("password");
		
		if(usernameNode == null || usernameNode.getLength() != 1){
			throw new Fault(new IllegalArgumentException("not valid username"));
		}
		
		if(passwordNode == null || passwordNode.getLength() != 1){
			throw new Fault(new IllegalArgumentException("not valid password"));
		}
		
		String userName = usernameNode.item(0).getTextContent();
		String userPass = passwordNode.item(0).getTextContent();
		
		if(!("admin".equals(userPass) && "admin".equals(userName))){
			throw new Fault(new IllegalArgumentException("username or password is not valid"));
		}
	}

}
