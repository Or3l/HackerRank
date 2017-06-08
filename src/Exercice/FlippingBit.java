package Exercice;

/**
 * Created by Aurel on 6/2/17.
 */
public class FlippingBit {
    public long flip(long number) {
        long maxInt=(long)Math.pow(2, 32)-1;
        return maxInt-number;
    }
}
