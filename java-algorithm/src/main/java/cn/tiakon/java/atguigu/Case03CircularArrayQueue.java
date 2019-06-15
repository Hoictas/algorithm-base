package cn.tiakon.java.atguigu;

/**
 * 数组模拟环形队列
 * <p>
 * project : algorithm-base
 * package : cn.tiakon.java.atguigu
 * email : tiankai.me@gmail.com
 *
 * @author Created by Tiakon on 2019/6/9 19:38.
 */
public class Case03CircularArrayQueue {

    /**
     * front    头指针，指向队列头的第一个位置。
     * rear     尾指针,指向队列尾的最后一个元素的后一个位置(?)。
     * length   队列长度
     * <p>
     * 通过利用取模(%),来实现循环利用数组。
     * 队列为空：fornt=real
     * 队列为满：(real-1)%length=front
     * 队列中有效个数：(real+length-front)%length //real=1 fornt=0
     */

    private int front;
    private int rear;
    private Integer[] integers;
    public int length;

    public Case03CircularArrayQueue(int length) {
        this.length = length;
        integers = new Integer[length];
        front = 0;
        rear = 0;
    }

    /**
     * 插入队列
     * last time   : 2019/6/9 19:35
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/9 19:35.
     */
    public void insertQueue(int num) {
        //判断队列是否已满
        if ((rear + 1) % length != front) {
            integers[rear] = num;
            rear = (rear + 1) % length;
            return;
        }
        throw new RuntimeException(">> 队列已满...");
    }

    /**
     * 显示队列数组
     * last time   : 2019/6/9 19:36
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/9 19:36.
     */
    public void showCircularQueue() {

        if (this.isFull()) {
            System.out.println(">> 当前队列为空");
            return;
        }
        for (int i = front; i < front + this.queueSize(); i++) {
            System.out.printf(" arrary[%d] = %d ", i % length, integers[i % length]);
        }
        System.out.println();
    }

    /**
     * 计算队列有效个数
     * last time   : 2019/6/9 20:23
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/9 20:23.
     */
    private int queueSize() {
        return (rear + length - front) % length;
    }

    /**
     * 显示队列指针
     * last time   : 2019/6/9 19:37
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/9 19:37.
     */
    public void showPointer() {
        System.out.printf("(%d,%d)\r\n", front, rear);
    }

    /**
     * 出队列
     * last time   : 2019/6/7 16:52
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/7 16:52.
     */
    public int outQueue() {
        if (!this.isFull()) {
            Integer temp = integers[front];
            front = front + 1 % length;
            return temp;
        }
        throw new RuntimeException(">> 当前队列为空...");
    }


    /**
     * 判断队列是否为空
     * last time   : 2019/6/9 19:33
     * last update : tiankai.me@gmail.com
     * status : test success | test failied | no test
     *
     * @author Created by Tiakon on 2019/6/9 19:33.
     */
    public boolean isFull() {
        return rear == front;
    }

    public void headQueue() {
        System.out.println(integers[front]);
    }

}
