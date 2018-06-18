package cn.tiakon.java.code.chapter03;


import java.util.Scanner;

/**
 * Desc : 字符串反转的测试
 * User : By Tiakon
 * Time : 2018/6/17 19:03
 */
public class D02_StackArrayCharApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please Enter String...");
            String input = scanner.nextLine();
            D02_StringReverse stringReverse = new D02_StringReverse(input);
            String reverse = stringReverse.doReverse();
            System.out.println(reverse);
        }
    }
}
