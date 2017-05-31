package Exercice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Aurel on 5/30/17.
 */
public class AnagramTest {

    private Anagram anagram;

    @Before
    public void setUp(){
        this.anagram  = new Anagram();
    }

    @Test
    public void isAnagram(){
        boolean res = anagram.areAnagram("abc", "cba");
        Assert.assertTrue(res);
    }

    @Test
    public void isAnagramFalse(){
        boolean res = anagram.areAnagram("ab", "cba");
        assertFalse(res);
    }

    @Test
    public void countElementToRemove(){
        int res = anagram.numberNeeded("ab", "cba");
        assertEquals(1, res);
    }

    @Test
    public void countElementToRemove2(){
        int res = anagram.numberNeeded("ab", "cbad");
        assertEquals(2, res);
    }

    @Test
    public void countElementToRemove3(){
        int res = anagram.numberNeeded("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        assertEquals(30, res);
    }

}