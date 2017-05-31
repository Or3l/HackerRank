package Exercice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Aurel on 5/28/17.
 */
public class LonelyIntegerTest {


    private LonelyInteger lonelyInteger;

    @Before
    public void setUp(){
        lonelyInteger = new LonelyInteger();
    }

    @Test
    public void create(){
        LonelyInteger lonelyInteger = new LonelyInteger();

    }

    @Test
    public void testWithSimpleArray(){
        int a[] = {1,1,2};
        Integer res = lonelyInteger.findUnique(a);

        Assert.assertEquals(res.intValue(), 2);

    }


    @Test
    public void testWithComplexArray(){
        int a[] = {1,1,2,2,3};
        Integer res = lonelyInteger.findUnique(a);

        Assert.assertEquals(res.intValue(), 3);

    }

}