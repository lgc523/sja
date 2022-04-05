package dev.spider.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestKitBar {

    @Test
    public void testKitBar() {
        int b = 23;
        Integer ar = 23;
        Integer bar = new Integer(23);
        Assert.assertNotSame("ar & bar is same", ar, bar);
//        Assert.assertNotSame("b & ar is same", b, ar);//alert
    }
}
