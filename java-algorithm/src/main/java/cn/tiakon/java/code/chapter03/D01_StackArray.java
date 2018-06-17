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
public class D01_StackArray {
    private int[] stackArray;
    private int maxSize;

    // 栈顶
    private int top;

    public D01_StackArray(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    //添加数据
    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("stack overflow...");
        }
    }

    //查看并删除
    public int pop() {
        return stackArray[top--];
    }

    //查看
    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (maxSize - 1);
    }
}
