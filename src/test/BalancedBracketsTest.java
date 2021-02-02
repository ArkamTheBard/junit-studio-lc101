package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void canHaveTextBetweenBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyUnbalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unbalancedBracketsWithText(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code]]"));
    }

    @Test
    public void onlyBracketsOutOfOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void textOutOfOrderBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void oneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
    }

    @Test
    public void onlyOpenBracketsWithTextReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void onlySquareBracketsAreChecked(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{{}"));
    }

    @Test
    public void multipleBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]][]"));
    }

}
