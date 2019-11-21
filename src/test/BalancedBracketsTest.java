package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets testBrackets;
    //TODO: add tests here
    @Before
    public void createBracketObject(){
        testBrackets = new BalancedBrackets();
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void singleSetOfBracketsReturnsTrue(){
        assertEquals(true, testBrackets.hasBalancedBrackets("[Test]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse(){
        assertEquals(false, testBrackets.hasBalancedBrackets("[Test"));
    }

    @Test
    public void onlyRightBracketReturnsFalse(){
        assertEquals(false, testBrackets.hasBalancedBrackets("Test]"));
    }

    @Test
    public void noBracketsReturnsTrue(){
        assertEquals(true, testBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void doubleBracketNestedSetReturnsTrue(){
        assertEquals(true, testBrackets.hasBalancedBrackets("[T[ES]T]"));
    }

    @Test
    public void doubleLeftSingleRightBracketsReturnsFalse(){
        assertEquals(false, testBrackets.hasBalancedBrackets("[T[ES]T"));
    }

    @Test
    public void doubleRightSingleLeftBracketsReturnsFalse(){
        assertEquals(false, testBrackets.hasBalancedBrackets("[TES]T]"));
    }

    @Test
    public void wrongOrderedBracketsReturnsFalse(){
        assertEquals(false, testBrackets.hasBalancedBrackets("]Test["));
    }

    @Test
    public void wrongOrderedDoubleBracketsReturnsFalse(){
        assertEquals(false, testBrackets.hasBalancedBrackets("]T]E[S[T"));
    }

    @Test
    public void doubleIndividualSetsReturnsTrue(){
        assertEquals(true, testBrackets.hasBalancedBrackets("[Te][ST]"));
    }
    @Test
    public void quadIndividualBracketsReturnsTrue(){
        assertEquals(true, testBrackets.hasBalancedBrackets("[T][E][S][T]"));
    }
}
