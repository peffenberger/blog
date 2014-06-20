package cz.effy.blog.binom.computation;

import java.math.BigDecimal;

/**
 * Created by petr on 20/06/2014.
 */
public class BigDecimalBinomicalCoefficient implements BinomicalCoefficient<BigDecimal> {

    public BigDecimal binomicalCoeficient(int n, int m) {
        BigDecimal[] b = new BigDecimal[n + 1];
        b[0] = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            b[i] = BigDecimal.ONE;
            for (int j = i - 1; j > 0; j--) {
                b[j] = b[j].add(b[j - 1]);
            }
        }
        return b[m];
    }
}
