package cn.tiakon.java.code.chapter01;

/**
 * Hello world!
 */
public class D01_Array {
    public static void main(String[] args) {
        long[] arr = new long[100];

        int nElems;
        int count;
        long searchKey;
        arr[0] = 91;
        arr[1] = 1;
        arr[2] = 81;
        arr[3] = 10;
        arr[4] = 61;
        arr[5] = 71;
        arr[6] = 41;
        arr[7] = 21;
        arr[8] = 121;
        arr[9] = 12;

        nElems = 10;

        //显示所有的元素
        for (count = 0; count < nElems; count++) {
            System.out.print(arr[count] + ",");
        }

        //查找91
        searchKey = 91;
        for (count = 0; count < nElems; count++) {
            if (arr[count] == searchKey) {
                System.out.println(arr[count]);
                break;
            }
        }
        if (count == nElems) {
            System.out.println("Can't Found " + searchKey);
        } else {
            System.out.println("Can Found " + searchKey);
        }

        // 删除数组中的一个数
        int deleteNumber = 71;
        for (count = 0; count < nElems; count++) {
            if (deleteNumber == arr[count]) {
                break;
            }
        }
        for (int i = count; i < nElems; i++) {
            arr[i] = arr[i + 1];
        }

        nElems--;

        //显示所有的元素
        for (count = 0; count < nElems; count++) {
            System.out.print(arr[count] + ",");
        }
    }
}
