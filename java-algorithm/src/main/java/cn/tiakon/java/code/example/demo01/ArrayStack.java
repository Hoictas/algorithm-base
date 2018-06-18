package cn.tiakon.java.code.example.demo01;

/**
* Desc :
* User : By Tiakon
* Time : 2018/6/18 8:36
*/
public class ArrayStack {
    private Cell[] stackArray;
    private int maxSize;

    // 栈顶
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Cell[maxSize];
        top = -1;
    }

    //添加数据
    public void push(Cell value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("stack overflow...");
        }
    }

    //查看并删除
    public Cell pop() {
        return stackArray[top--];
    }

    //查看
    public Cell peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (maxSize - 1);
    }
}
