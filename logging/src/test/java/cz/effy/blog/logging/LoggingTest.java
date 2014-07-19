package cz.effy.blog.logging;

import cz.effy.blog.support.common.ExecutionTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Petr Effenberger on 19.7.14.
 */
public class LoggingTest {

	final Logger logger = LogManager.getLogger(getClass());

	private LoggingClass loggingClass;

	@BeforeClass
	public void setup() {
		loggingClass = new LoggingClass();
	}

	@Test
	public void properLogTest() {
		ExecutionTime executionTime = new ExecutionTime();
		loggingClass.properlyLoggedMethod();
		logger.info(executionTime);
	}

	@Test
	public void poorLogTest() {
		ExecutionTime executionTime = new ExecutionTime();
		loggingClass.poorlyLoggedMethod();
		logger.info(executionTime);
	}

	@Test
	public void simpleProperLogTest() {
		ExecutionTime executionTime = new ExecutionTime();
		for (int i = 0; i < 1000; i++) {
			loggingClass.simpleProperlyLoggedMethod();
		}
		logger.info(executionTime);
	}

	@Test
	public void simplePoorLogTest() {
		ExecutionTime executionTime = new ExecutionTime();
		for (int i = 0; i < 1000; i++) {
			loggingClass.simplePoorlyLoggedMethod();
		}
		logger.info(executionTime);
	}
}
