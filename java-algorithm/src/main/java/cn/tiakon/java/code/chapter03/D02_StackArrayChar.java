package cn.tiakon.java.code.chapter03;

/**
* Desc : 实现字符串反转的栈对象
* User : By Tiakon
* Time : 2018/6/17 19:02
*/
public class D02_StackArrayChar {
    private char[] stackArray;
    private int maxSize;

    // 栈顶
    private int top;

    public D02_StackArrayChar(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }

    //添加数据
    public void push(char value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("stack overflow...");
        }
    }

    //查看并删除
    public char pop() {
        return stackArray[top--];
    }

    //查看
    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (maxSize - 1);
    }
}
