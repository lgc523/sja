package dev.spider.junit;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore(value = "not ready yet")
public class TestKitFoo {

    @Test
    public void testKitFoo() {
        Assert.assertArrayEquals(Lists.newArrayList(1, 2, 3).toArray(),
                Lists.newArrayList(1, 2).toArray());
    }
}
