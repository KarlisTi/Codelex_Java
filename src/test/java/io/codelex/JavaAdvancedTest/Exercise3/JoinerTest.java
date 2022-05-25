package io.codelex.JavaAdvancedTest.Exercise3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinerTest {
    @Test
    public void joinWithSeperator() {
        String expected = "1-2-3-4";
        Joiner newJoiner = new Joiner<>("-");
        Assert.assertEquals(expected, newJoiner.joinWithSeperator(1234));
    }
}
