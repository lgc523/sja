package dev.spider.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestWithParameter {

    private int expected;
    private int first;
    private int second;

    public TestWithParameter(int expected, int first, int second) {
        this.expected = expected;
        this.first = first;
        this.second = second;
    }

    @Parameterized.Parameters
    public static Collection addedNumbers() {
        return Arrays.asList(new Integer[][]{{3, 2, 1}, {5, 2, 3}});
    }

    @Test
    public void testCalculate() {
        Calculate add = new Calculate();
        System.out.println("add with: " + first + " & " + second);
        Assert.assertEquals(expected, add.sum(first, second));

    }

    static class Calculate {
        public int sum(int v0, int v1) {
            System.out.println("param: v0:" + v0 + ", v1:" + v1);
            return v0 + v1;
        }
    }
}
