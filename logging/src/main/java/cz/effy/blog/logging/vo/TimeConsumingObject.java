package cz.effy.blog.logging.vo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Petr Effenberger on 19.7.14.
 */
public class TimeConsumingObject {

	final Logger logger = LogManager.getLogger(getClass());

	@Override
	public String toString() {
		logger.trace("toString invoked");
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Object" + this.hashCode();
	}
}
