package dev.spider.junit;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestKitFoo.class, TestKitBar.class})
public class TestJunitKit {

    //not ready yet

    //TODO not work
    @Test
    public void testAssume() {
        Assume.assumeTrue("17 > 23 is false", 17 > 23);
        org.hamcrest.MatcherAssert.assertThat("", true);
    }


}
