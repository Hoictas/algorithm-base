package cn.tiakon.java.code.chapter02;

/**
 * 简单排序
 * Desc :选择排序
 * <p>
 * 效率比冒泡排序好一点
 * <p>
 * 循环的次数 同为O(N^2)，交换的次数 选择更少 O(N)
 * <p>
 * User : By Tiakon
 * Time : 2018/6/16 16:29
 */
public class D02_SelectSort {

    private long[] arr;
    private int nElems;

    public D02_SelectSort(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (arr[min] > arr[in]) {
                    min = in;
                }
            }
            long tmp;
            tmp = arr[out];
            arr[out] = arr[min];
            arr[min] = (int) tmp;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
