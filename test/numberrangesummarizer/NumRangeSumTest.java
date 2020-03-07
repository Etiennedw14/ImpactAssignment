/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberrangesummarizer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Etienne De Winnaar
 */
public class NumRangeSumTest {

    /**
     * Tests of collect method, of class NumRangeSum.
     */
    
    @Test
    public void testCollect() {
        System.out.println("collect with '1' as input:");
        String input = "1";
        NumRangeSum instance = new NumRangeSum();
        Collection<Integer> expResult = Arrays.asList(1);
        Collection<Integer> result = instance.collect(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testCollect2() {
        System.out.println("collect with '5' as input:");
        String input = "5";
        NumRangeSum instance = new NumRangeSum();
        Collection<Integer> expResult = Arrays.asList(5);
        Collection<Integer> result = instance.collect(input);
        assertEquals(expResult, result);
    }

    /**
     * Tests of summarizeCollection method, of class NumRangeSum.
     */
    @Test
    public void testSummarizeCollection() {
        System.out.println("summarizeCollection with given sample data:");
        Collection<Integer> input = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        NumRangeSum instance = new NumRangeSum();
        String expResult = "1, 3, 6-8, 12-15, 21-24, 31";
        String result = instance.summarizeCollection(input);
        System.out.println("result:" + result);
        System.out.println("expected result:" + expResult + "\n");
        assertEquals(expResult, result);
    }

    @Test
    public void testSummarizeCollection2() {
        System.out.println("summarizeCollection with a starting and ending sequence:");
        Collection<Integer> input = Arrays.asList(1, 2, 4, 7, 8, 9, 11, 15, 17, 18, 19, 20, 21);
        NumRangeSum instance = new NumRangeSum();
        String expResult = "1-2, 4, 7-9, 11, 15, 17-21";
        String result = instance.summarizeCollection(input);
        System.out.println("result:" + result);
        System.out.println("expected result:" + expResult + "\n");
        assertEquals(expResult, result);
    }

    @Test
    public void testSummarizeCollection3() {
        System.out.println("summarizeCollection with only sequential numbers:");
        Collection<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        NumRangeSum instance = new NumRangeSum();
        String expResult = "1-16";
        String result = instance.summarizeCollection(input);
        System.out.println("result:" + result);
        System.out.println("expected result:" + expResult + "\n");
        assertEquals(expResult, result);
    }

    @Test
    public void testSummarizeCollection4() {
        System.out.println("summarizeCollection with no sequential numbers:");
        Collection<Integer> input = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21);
        NumRangeSum instance = new NumRangeSum();
        String expResult = "1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21";
        String result = instance.summarizeCollection(input);
        System.out.println("result:" + result);
        System.out.println("expected result:" + expResult + "\n");
        assertEquals(expResult, result);
    }
}
