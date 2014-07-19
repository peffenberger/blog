package cz.effy.blog.binom.computation;

import cz.effy.blog.support.common.ExecutionTime;
import cz.effy.blog.support.common.MemoryPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertEquals;

/**
 * Created by petr on 20/06/2014.
 */
public class BinomicalCoefficientTest {

	final Logger logger = LogManager.getLogger(getClass());

	@Test
	public void intTest() {
		assertEquals(binomicalCoefficientTest(new IntegerBinomicalCoefficient(), 10000000, 3, 3), Integer.valueOf(1));
		assertEquals(binomicalCoefficientTest(new IntegerBinomicalCoefficient(), 10000000, 33, 16), Integer.valueOf(1166803110));
		assertEquals(binomicalCoefficientTest(new IntegerBinomicalCoefficient(), 10000000, 3, 2), Integer.valueOf(3));
		assertEquals(binomicalCoefficientTest(new IntegerBinomicalCoefficient(), 10000000, 46, 40), Integer.valueOf(9366819));
	}

	@Test
	public void longTest() {
		assertEquals(binomicalCoefficientTest(new LongBinomicalCoefficient(), 10000000, 3, 3), Long.valueOf(1));
		assertEquals(binomicalCoefficientTest(new LongBinomicalCoefficient(), 10000000, 33, 16), Long.valueOf(1166803110));
		assertEquals(binomicalCoefficientTest(new LongBinomicalCoefficient(), 10000000, 3, 2), Long.valueOf(3));
		assertEquals(binomicalCoefficientTest(new LongBinomicalCoefficient(), 10000000, 46, 36), Long.valueOf(4076350421L));
	}

	@Test
	public void bigDecimalTest() {
		BigDecimal res1 = BigDecimal.ONE;
		BigDecimal res2 = new BigDecimal(1166803110);
		BigDecimal res3 = new BigDecimal(3);
		BigDecimal res4 = new BigDecimal(4076350421L);
		assertEquals(binomicalCoefficientTest(new BigDecimalBinomicalCoefficient(), 100000, 3, 3), res1);
		assertEquals(binomicalCoefficientTest(new BigDecimalBinomicalCoefficient(), 100000, 33, 16), res2);
		assertEquals(binomicalCoefficientTest(new BigDecimalBinomicalCoefficient(), 100000, 3, 2), res3);
		assertEquals(binomicalCoefficientTest(new BigDecimalBinomicalCoefficient(), 100000, 46, 36), res4);
	}

	private <T> T binomicalCoefficientTest(BinomicalCoefficient<T> computationBean, int cyclesNo, int m, int n) {
		ExecutionTime executionTime = new ExecutionTime();
		T result = null;
		for (int i = 0; i < cyclesNo; i++) {
			result = computationBean.binomicalCoeficient(m, n);
		}
//		System.out.println(new MemoryPrint());
//		System.out.println(executionTime);
		logger.info(new MemoryPrint());
		logger.info(executionTime);
		return result;
	}
}
