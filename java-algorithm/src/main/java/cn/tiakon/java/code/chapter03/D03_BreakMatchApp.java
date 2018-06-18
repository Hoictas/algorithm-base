package cn.tiakon.java.code.chapter03;

import java.util.Scanner;

/**
 * Desc : 分隔符匹配
 * User : By Tiakon
 * Time : 2018/6/17 21:44
 */

public class D03_BreakMatchApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("please enter string");
            String line = sc.nextLine();
            D03_BreakMatch breakMatch = new D03_BreakMatch(line);
            breakMatch.check();
        }

    }
}
