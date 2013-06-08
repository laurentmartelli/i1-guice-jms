package com.thoughtworks.i1.jms;

import javax.jms.Message;
import javax.jms.Session;
import javax.jms.JMSException;

public interface MessageCreator {
    public Message createMessage(Session session) throws JMSException; 
}
