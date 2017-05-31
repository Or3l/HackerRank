package Exercice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aurel on 5/28/17.
 */
public class LeftRotationTest {

    private LeftRotation leftRotation;

    @Before
    public void setUp(){
        leftRotation = new LeftRotation();
    }

    @Test
    public void rotateBy4(){
        int[] a = {1,2,3,4,5};
        int[] res = leftRotation.rotate(a, 4);
        //{5,1,2,3,4}
        //size-i
        assertEquals(res[0], 5);
        assertEquals(res[1], 1);
        assertEquals(res[2], 2);
        assertEquals(res[3], 3);
        assertEquals(res[4], 4);
    }

    @Test
    public void rotateBy2(){
        int[] a = {1,2,3,4,5};
        int[] res = leftRotation.rotate(a, 2);
        //{3,4,5,1,2}
        //size-i

        assertEquals(res[0], 3);
        assertEquals(res[1], 4);
        assertEquals(res[2], 5);
        assertEquals(res[3], 1);
        assertEquals(res[4], 2);

    }
}