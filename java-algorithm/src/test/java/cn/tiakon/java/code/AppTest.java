package cn.tiakon.java.code;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple D01_Array.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
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

    @Test
    public void DemoTest() {
        // 参考 ： https://www.itcodemonkey.com/article/11696.html
        // 参考 ： https://zhaojuan8.iteye.com/blog/163238
        /************************************************************
         * 前置++和后置++的区别
         * 在代码int j = i++;中实际上是先把i赋值给j然后在执行i++,由此可以得出结论
         * 在后置++中会先执行前面的运算,后置后面的++运算,那么在这里j就是0,i就是1
         * 那么上面的运算步骤实际上就是：
         *      1)j=i;//先执行赋值运算j和i都等于0;
         *      2)i=i+1;//i等于2；
         * 在代码int c=++j;中这里是前置++那么会先执行前面的++然后在执行赋值运算
         * 由此可得出前置++会先执行前面的++然后才在做其他的运算，那么上面的运算步骤实际上
         * 就是
         *      1)j=j+1;//j在这里是等于2的
         *      2）c=j;//j对c进行赋值运算c等于2
         ************************************************************/
       /* int i = 1, a = 0, b = 0;
        System.out.println(i);   // 1
        a = i++;  // 先赋值再运算 a=i , i=i+1 ;
        System.out.println(a);   // 1
        System.out.println(i);   // 2
        b = ++i;  // 先运算再赋值 b= i+1
        System.out.println(b);   // 3
        System.out.println(i);   // 3
        System.out.println(i++); // 3
        System.out.println(i);   // 4*/

        int x = 0;
        for (int j = 0; j < 10; j++) {
//            System.out.println(++x);
            System.out.println(x++);
        }
        System.out.println(x);


    }
}