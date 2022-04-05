package dev.spider.junit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {

    @Before
    public void beforeAssert(){
        System.out.println("init over.");
    }

    @Test(timeout = 1,expected = AssertionError.class)
    public void testAssert() {
        Assert.assertEquals(2, 2);
        String s = "assert";
        String ss = "assert";
        String sss = new String("assert");
        Assert.assertTrue("s not equals to  ss", s == ss);
        Assert.assertTrue("ss not equals to  sss", ss.equals(sss));
        Assert.assertTrue("ss != sss", ss == sss);

        Assert.assertSame(s, ss);
    }

    @AfterClass
    public static void afterAssertExec() {
        System.out.println("afterAssertExec over.");
    }
}
