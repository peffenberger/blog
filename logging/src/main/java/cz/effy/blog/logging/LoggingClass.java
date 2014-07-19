package cz.effy.blog.logging;

import cz.effy.blog.logging.vo.TimeConsumingObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Petr Effenberger on 19.7.14.
 */
public class LoggingClass {

	final Logger logger = LogManager.getLogger(getClass());

	private TimeConsumingObject timeConsumingObject1;

	private TimeConsumingObject timeConsumingObject2;

	private TimeConsumingObject timeConsumingObject3;

	public LoggingClass() {
		this.timeConsumingObject1 = new TimeConsumingObject();
		this.timeConsumingObject2 = new TimeConsumingObject();
		this.timeConsumingObject3 = new TimeConsumingObject();
	}

	public void loggedMethod() {
		logger.trace("entering loggedMethod");
		logger.info("timeConsumingObject1 {}", timeConsumingObject1.toString());
		logger.debug("timeConsumingObject1 {}", timeConsumingObject2.toString());
		logger.warn("timeConsumingObject1 {}", timeConsumingObject3.toString());
	}
}
