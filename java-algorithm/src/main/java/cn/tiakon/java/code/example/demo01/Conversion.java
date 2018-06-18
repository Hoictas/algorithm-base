package cn.tiakon.java.code.example.demo01;

import cn.tiakon.java.code.chapter03.D01_StackArray;

/**
 * Desc : 十进制数转八进制数
 * User : By Tiakon
 * Time : 2018/6/18 9:02
 */
public class Conversion {
    public static void conversion(int N) {
        D01_StackArray stack = new D01_StackArray(20);
        while (N != 0) {
            stack.push(N % 8);
            N /= 8;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        conversion(2007);
    }
}
