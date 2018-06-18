package cn.tiakon.java.code.chapter02;

/**
 * 简单排序
 * Desc :插入排序
 * <p>
 * 1.将前一个数当做有序数组，并将下一个要比较的数复制一份
 * 2.将复制的数与有序数组比较，小于则让数组中的数向后复制一位，大于则插入
 * <p>
 * 在随机数组的情况下排序，效率比冒泡排序好一点
 * <p>
 * 循环的次数同为 O(N^2)
 * 交换的次数更少 O(N)
 * <p>
 * User : By Tiakon
 * Time : 2018/6/16 16:29
 */
public class D03_InsertSort {

    private long[] arr;
    private int nElems;

    public D03_InsertSort(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }


    public void insertSort() {
        int out, in;
        long tmp;
        for (out = 1; out < nElems; out++) {
            tmp = arr[out];
            in = out;

            // 当需要满足某个条件才循环时使用 while
            while (in > 0 && arr[in - 1] >= tmp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = tmp;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
