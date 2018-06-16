package cn.tiakon.java.code.chapter02;

/**
 * Desc :二分查找，适用于有序数组
 * <p>
 * 有序数组二分查找比较次数
 * <p>
 * 数据量                  所需比较次数
 * 10                       4
 * 100                      7
 * 1000                     10
 * 10000                    14
 * 100000                   17
 * 1000000                  20
 * 10000000                 24
 * 100000000                27
 * 1000000000               30
 * User : By Tiakon
 * Time : 2018/6/16 9:46
 */
public class D01_OrderArray {

    private long[] arr;
    private int nElems;

    //查找次数
    int count = 0;

    public D01_OrderArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public int getSize() {
        return nElems;
    }

    //添加数据项（线性查找）
    public void insert(long value) {
        int i;
        for (i = 0; i < getSize(); i++) {
            if (arr[i] > value) {
                break;
            }
        }
        for (int j = getSize(); j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        nElems++;
    }

    //二分查找
    public int find(long value) {
        int lowBound = 0;
        int upperBound = getSize() - 1;
        int middleBound;

        while (true) {
            count++;
            middleBound = (lowBound + upperBound) / 2;
            if (arr[middleBound] == value) {
                return middleBound;
            } else if (lowBound > upperBound) {//没有找到
                return -1;//返回-1
            } else if (value < arr[middleBound]) {
                upperBound = middleBound - 1;
            } else if (value > arr[middleBound]) {
                lowBound = middleBound + 1;
            }
        }

    }

    public int getFindCount() {
        return count;
    }

    //删除数据项
    public void deleteByBinSearch(long value) {
        int index = find(value);
        if (index != -1) {
            System.out.println("delete success " + arr[index]);
            for (int j = index; j < getSize(); j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
        } else {
            System.out.println("delete of number is not exist...");
        }


    }

    public void deleteByLinear(long value) {
        int i;

        for (i = 0; i < getSize(); i++) {
            if (arr[i] == value) {
                break;
            }
        }

        if (i == getSize()) {
            System.out.println("delete of number is not exist...");
        } else {
            System.out.println("delete success " + arr[i]);
            for (int j = i; j < getSize(); j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
        }
    }

    public void display() {
        for (int i = 0; i < getSize(); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }


}
