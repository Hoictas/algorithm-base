package cn.tiakon.java.code.chapter02;

/**
 * 简单排序
 * Desc :选择排序
 *
 * 1.让前一个数和剩下的数做比较，标记出最小的数
 * 2.让前一个数和最小的数位置交换
 * 3.再让下一个数和剩下的数做比较，标记出最小的数
 *
 * 效率比冒泡排序好一点
 *
 * 循环的次数同为 O(N^2)
 * 交换的次数更少 O(N)
 *
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
