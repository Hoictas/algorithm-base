package cn.tiakon.java.atguigu;

/**
 * 数组模拟队列
 * <p>
 * project : algorithm-base
 * package : cn.tiakon.java.atguigu
 * email : tiankai.me@gmail.com
 * status : test success
 *
 * @author Created by Tiakon on 2019/6/7 14:07.
 */
public class Case02ArrayQueue {

    /**
     * front    头指针，指向队列头的前一个位置。
     * rear     尾指针,指向队列尾的最后一个元素。
     * length   队列长度
     * <p>
     * 队列为空：fornt=real
     * 队列为满：real-1 = length
     */

    private int front;
    private int rear;
    private Integer[] integers;
    public int length;

    public Case02ArrayQueue(int length) {
        this.length = length;
        integers = new Integer[length];
        front = -1;
        rear = -1;
    }

    public void insertQueue(int num) {
        if (rear != length - 1) {
            rear += 1;
            integers[rear] = num;
            return;
        }
        throw new RuntimeException(">> 队列已满...");
    }

    public void showArray() {
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("%d ", integers[i]);
        }
        System.out.println();
    }


    public void showPointer() {
        System.out.printf("(%d,%d)\r\n", front, rear);
    }

    /**
     * 取下一个值
     * last time   : 2019/6/7 16:52
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/7 16:52.
     */
    public int next() {
        if (this.hasNext()) {
            front += 1;
            return integers[front];
        }
        throw new RuntimeException(">> 当前队列为空...");
    }


    /**
     * 判断队列中是否还有值
     * last time   : 2019/6/7 16:52
     * last update : tiankai.me@gmail.com
     * status : test success
     *
     * @author Created by Tiakon on 2019/6/7 16:52.
     */
    public boolean hasNext() {
        return front != rear;
    }

}
