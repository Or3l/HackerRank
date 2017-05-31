package TddSet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Aurel on 5/21/17.
 */
public class SetTest {

    Set set;

    @org.junit.Before
    public void setUp() throws Exception {
        set = new Set();
    }



    @Test
    public void testIsEmpty(){
        assertTrue(set.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, set.size());
    }

    @Test
    public void testSizeAfterAdd(){
        set.add("1");
        assertEquals(1, set.size());
    }

    @Test
    public void testContain(){
        set.add("1");
        assertTrue(set.contains("1"));
    }

    @Test
    public void testRemove(){
        set.add("1");
        set.add("2");
        set.remove("2");
        assertFalse(set.contains("2"));
        assertTrue(set.contains("1"));
    }

}