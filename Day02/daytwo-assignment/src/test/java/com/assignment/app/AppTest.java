package com.assignment.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testrev()
    {
        Reverse reverse = new Reverse();
        String a ="Hello";
        String results = Reverse.rev(a);
        Assert.assertEquals(results,"olleH");
    }
    @Test
    public void testpal()
    {
        Pallindrome pal = new Pallindrome();
        String a ="Hello";
        Boolean results = Pallindrome.Pal(a);
        Assert.assertEquals(results,false);
    }
    @Test
    public void testapp()
    {
        Append reverse = new Append();
        String a ="Hello";
        String b = "World";
        String results = Append.plus(a,b);
        Assert.assertEquals(results,"HelloWorld");
    }
}
