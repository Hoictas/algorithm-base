package cn.tiakon.java.code.chapter03;

/**
 * Desc :
 * <p>
 * 栈就是一组记录，表示形式为先进后出。
 * 1.通常情况作为程序员的工具来运用
 * 2.受限访问
 * 3.更加抽象(主要通过接口实现)
 * <p>
 * User : By Tiakon
 * Time : 2018/6/17 18:31
 */
public class D01_StackArrayApp {
    public static void main(String[] args) {
        D01_StackArray stackArray = new D01_StackArray(10);

        //  添加数据
        for (int i = 0; i < 10; i++) {
            stackArray.push(i);
        }

        //  查看数据
        while (!stackArray.isEmpty()) {
            System.out.print(stackArray.pop() + " ");
        }

        System.out.println("");
        System.out.println("StackArray is Empty :" + stackArray.isEmpty());

        for (int i = 10; i < 20; i++) {
            stackArray.push(i);
        }

        //  查看数据
        while (!stackArray.isEmpty()) {
            System.out.print(stackArray.pop() + " ");
        }

        System.out.println("");
        System.out.println("StackArray is Empty :" + stackArray.isEmpty());

    }
}
