package Exercice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Aurel on 5/31/17.
 */
public class RansomNoteTest {

    private RansomNote ransomNote;

    @Before
    public void setUp(){
        this.ransomNote = new RansomNote();
    }

    @Test
    public void isPossible(){

        String paper = "give me one grand today night";
        String note = "give one grand today";
        int m = 6, n = 4;
        boolean res = ransomNote.testIfPossible(paper, note, m, n);
        Assert.assertTrue(res);
    }

}