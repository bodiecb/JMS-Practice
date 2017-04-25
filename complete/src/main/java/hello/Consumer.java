package hello;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;

/**
 * Created by cmbodenh on 4/25/17.
 */
public class Consumer implements MessageConsumer {
	@Override
	public String getMessageSelector() throws JMSException {
		return null;
	}

	@Override
	public MessageListener getMessageListener() throws JMSException {
		return null;
	}

	@Override
	public void setMessageListener(MessageListener messageListener) throws JMSException {

	}

	@Override
	public Message receive() throws JMSException {
		return null;
	}

	@Override
	public Message receive(long l) throws JMSException {
		return null;
	}

	@Override
	public Message receiveNoWait() throws JMSException {
		return null;
	}

	@Override
	public void close() throws JMSException {

	}
}
