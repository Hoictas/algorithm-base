package cn.tiakon.java.code.chapter01;

/**
 * 数组: 查找快、插入删除慢
 * 有序数组
 * 优点: 查找速度比无序快很多
 * 缺点: 插入时，要按排序的方式把后面的数据进行移动
 *
 * 有序数据和无序数组共同缺点:
 * 删除数据项时，必须把后面的数据向前移动来填补删除项的位置。
 *
 * 大 O 表示法
 * 线性查找         O(N)        还可以
 * 二分查找         O(log N)    良好
 * 无序数组的插入    O(1)        优秀
 * 有序数组的插入    O(N)        还可以
 * 无序数组的删除    O(N)        还可以
 * 有序数组的删除    O(N)        还可以
 * <p>
 * 效率:
 * O(1)>O(logN)>O(N)>O(N^2)
 *
 */
public class D01_Array {
    public static void main(String[] args) {
        long[] arr = new long[100];

        //有效值
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
