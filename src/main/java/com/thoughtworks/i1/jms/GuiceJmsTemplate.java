package com.thoughtworks.i1.jms;

import javax.jms.JMSException;
import javax.jms.Message;

/**
 * GuiceJmsTemplate
 * @author krummas@gmail.com
 */
public interface GuiceJmsTemplate extends AutoCloseable {
    public void send(MessageCreator messageCreator) throws JMSException;
    public Message receive() throws JMSException;
}
