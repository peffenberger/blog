package cz.effy.blog.logging;

import cz.effy.blog.logging.vo.SimpleObject;
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

	private SimpleObject simpleObject;

	public LoggingClass() {
		this.timeConsumingObject1 = new TimeConsumingObject();
		this.timeConsumingObject2 = new TimeConsumingObject();
		this.timeConsumingObject3 = new TimeConsumingObject();
		this.simpleObject = new SimpleObject();
	}

	public void properlyLoggedMethod() {
		logger.trace("entering properlyLoggedMethod");
		logger.info("timeConsumingObject1 {}", timeConsumingObject1);
		logger.warn("simpleObject {}", simpleObject);
		logger.debug("timeConsumingObject2 {}", timeConsumingObject2);
		logger.warn("timeConsumingObject3 {}", timeConsumingObject3);
	}

	public void poorlyLoggedMethod() {
		logger.trace("entering properlyLoggedMethod");
		logger.info("timeConsumingObject1 " + timeConsumingObject1);
		logger.warn("simpleObject " + simpleObject);
		logger.debug("timeConsumingObject2 " + timeConsumingObject2);
		logger.warn("timeConsumingObject3 {}", timeConsumingObject3.toString());
	}

	public void simpleProperlyLoggedMethod() {
		logger.warn("simpleObject {}", simpleObject);
	}

	public void simplePoorlyLoggedMethod() {
		logger.warn("simpleObject {}", simpleObject.toString());
	}
}
