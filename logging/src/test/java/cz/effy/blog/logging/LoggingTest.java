package cz.effy.blog.logging;

import cz.effy.blog.support.common.ExecutionTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Created by Petr Effenberger on 19.7.14.
 */
public class LoggingTest {

	final Logger logger = LogManager.getLogger(getClass());

	@Test
	public void logTest(){
		ExecutionTime executionTime = new ExecutionTime();
		new LoggingClass().loggedMethod();
		logger.info(executionTime);
	}
}
