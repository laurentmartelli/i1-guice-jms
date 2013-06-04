package se.marcus.guice.jms;

import javax.jms.Message;
import javax.jms.Session;
import javax.jms.JMSException;

/**
 * Created by IntelliJ IDEA.
 * User: marcuse
 * Date: Dec 21, 2008
 * Time: 7:02:06 AM
 * To change this template use File | Settings | File Templates.
 */
public interface MessageCreator {
    public Message createMessage(Session session) throws JMSException; 
}
