package cn.tiakon.java.code.chapter01;

/**
 * Desc :简单数组
 * User : By Tiakon
 * Time : 2018/6/16 3:06
 */
public class D03_HighArray {

    // 存储数据的数组
    private long[] arr;
    private int nElems;

    // 构造函数
    public D03_HighArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    //查找
    public boolean find(long searchKey) {
        int count = 0;
        for (count = 0; count < nElems; count++) {
            if (searchKey == arr[count]) {
                break;
            }
        }
        return count != nElems;
    }

    //插入
    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    //删除
    public boolean delete(long value) {
        int index;
        for (index = 0; index < nElems; index++) {
            if (arr[index] == value) {
                break;
            }
        }

        if (index == nElems) {
            System.out.println("delete faile " + value);
            return false;
        } else {
            System.out.println("delete successful " + arr[index]);
            for (int i = index; i < nElems; i++) {
                arr[i] = arr[i + 1];
            }
            nElems--;
            return true;
        }
    }

    //删除
    public boolean deleteByIndex(int index) {

        return false;
    }

    //查看所有
    public void queryAll() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");
    }

}


