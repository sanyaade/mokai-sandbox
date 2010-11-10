package org.mokai.connector.mail;

import org.mokai.MessageProducer;
import org.mokai.Receiver;
import org.mokai.annotation.Resource;

public class MailReceiver implements Receiver {

	@Resource
	private MessageProducer messageProducer;
	
	
}
