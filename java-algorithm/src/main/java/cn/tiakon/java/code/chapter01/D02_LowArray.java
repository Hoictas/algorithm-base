package cn.tiakon.java.code.chapter01;

/**
 * Desc :简单数组
 * User : By Tiakon
 * Time : 2018/6/16 3:06
 */
public class D02_LowArray {

    // 存储数据的数组
    private long[] arr;

    // 构造函数
    public D02_LowArray(int size) {
        arr = new long[size];
    }

    public void setElem(int index, long value) {
        arr[index] = value;
    }

    public long getElem(int index) {
        return arr[index];
    }
}
