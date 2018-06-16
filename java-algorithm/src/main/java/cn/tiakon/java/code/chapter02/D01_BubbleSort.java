package cn.tiakon.java.code.chapter02;

/**
 * 简单排序
 * Desc :冒泡排序
 *
 * 1.比较两个相邻的对象
 * 2.如果左边的大于右边，则调换位置
 * 3.向右边移动一个位置，比较接下来的两对对象
 *
 * 循环次数:
 * n*(n-1)/2
 * 大 O 表示法: O(n^2)
 *
 * 最坏情况下:
 * 交换次数与比较次数相同
 * 大 O 表示法: O(n^2)
 *
 * User : By Tiakon
 * Time : 2018/6/16 16:29
 *
 */
public class D01_BubbleSort {

    private long[] arr;
    private int nElems;

    public D01_BubbleSort(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    long tmp;
                    tmp = arr[in + 1];
                    arr[in + 1] = arr[in];
                    arr[in] = tmp;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

}
