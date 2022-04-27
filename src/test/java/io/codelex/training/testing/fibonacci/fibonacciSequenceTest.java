//package io.codelex.training.testing.fibonacci;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class fibonacciSequenceTest {
//    @Test
//    void testFirstNumbers() {
//        //GIVEN
//        fibonacciSequence sequence = new fibonacciSequence();
//        int firstNumberToGet = 1;
//        int secondNumberToGet = 2;
//        int thirdNumberToGet = 3;
//        int fourthNumberToGet = 5;
//
//        int excpectedFirst = 0;
//        int excpectedSecond = 1;
//        int excpectedThird = 1;
//        int excpectedFourth = 3;
//
//        //WHEN - THEN
//        Assert.assertEquals(excpectedFirst, sequence.getNumber(firstNumberToGet));
//        Assert.assertEquals(excpectedSecond, sequence.getNumber(secondNumberToGet));
//        Assert.assertEquals(excpectedThird, sequence.getNumber(thirdNumberToGet));
//        Assert.assertEquals(excpectedFourth, sequence.getNumber(fourthNumberToGet));
//    }
//
//    @Test
//    void testLatterNumbers() {
//        fibonacciSequence sequence = new fibonacciSequence();
//
//        Assert.assertEquals(55, sequence.getNumber(11));
//        Assert.assertEquals(89, sequence.getNumber(12));
//        Assert.assertEquals(144, sequence.getNumber(13));
//
//    }
//}
