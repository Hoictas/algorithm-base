package cn.tiakon.java.wms;

/**
 * project : algorithm-base
 * package : cn.tiakon.java.wms
 * email : tiankai.me@gmail.com
 *
 * @author Created by Hoictas on 2019/7/03 23:35.
 */
public class Case01Array {
    public static void main(String[] args) {

        ArrayDemo array = new ArrayDemo(10);

        array.insertByindex(6, 0);
        array.insertByindex(1, 1);
        array.insertByindex(8, 2);
        array.insertByindex(5, 3);
        array.insertByindex(4, 4);
        array.insertByindex(9, 5);
        array.insertByindex(7, 6);
        array.insertByindex(31, 3);
        array.insertByindex(21, 2);
        array.insertByindex(11, 1);

        array.output();

    }
}

class ArrayDemo {
    private int[] ints;
    private int size;


    public ArrayDemo(int capacity) {
        this.ints = new int[capacity];
        this.size = 0;
    }

    public void insertByindex(int value, int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(">> 插入位置超出范围...");
        }

        // 数组扩容
        if (this.size >= ints.length) {
            int[] arrayNew = new int[this.ints.length * 2];
            System.arraycopy(ints, 0, arrayNew, 0, ints.length);
            this.ints = arrayNew;
        }


        // 从右往左循环，将元素右移
        for (int i = size - 1; i >= index; i--) {
            ints[i + 1] = ints[i];
        }

        ints[index] = value;

        size++;
    }

    public void output() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(ints[i]);
        }
    }

}





