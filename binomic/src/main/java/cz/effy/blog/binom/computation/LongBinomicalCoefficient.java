package cz.effy.blog.binom.computation;

/**
 * Created by petr on 20/06/2014.
 */
public class LongBinomicalCoefficient implements BinomicalCoefficient<Long> {

    public Long binomicalCoeficient(int n, int m) {
        if (n == m || m == 0) {
            return 1L;
        }
        long[] b = new long[n + 1];
        b[0] = 1;
        for (int i = 1; i <= n; i++) {
            b[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                b[j] += b[j - 1];
            }
        }
        return b[m];
    }
}
