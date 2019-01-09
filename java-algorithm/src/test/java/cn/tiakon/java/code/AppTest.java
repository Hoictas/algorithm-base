package cn.tiakon.java.code;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple D01_Array.
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    /**
     * Reverse() Test :-)
     */
    @Test
    public void reverseTest() {
        StringBuffer sb = new StringBuffer();
        sb.append("中华民国");
        System.out.println(sb.reverse());
    }
}
