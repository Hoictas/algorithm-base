package cn.tiakon.java.code.chapter02;

/**
 * 简单排序
 * Desc :插入排序
 * <p>
 * 1.让前一个数和剩下的数做比较，标记出最小的数
 * 2.让前一个数和最小的数位置交换
 * 3.再让下一个数和剩下的数做比较，标记出最小的数
 * <p>
 * 效率比冒泡排序好一点
 * <p>
 * 循环的次数同为 O(N^2)
 * 交换的次数更少 O(N)
 * <p>
 * User : By Tiakon
 * Time : 2018/6/16 16:29
 */
public class D03_InsertSortApp {

    public static void main(String[] args) {
        D03_InsertSort insertSort = new D03_InsertSort(20);

/*        insertSort.insert(6);
        insertSort.insert(5);
        insertSort.insert(4);
        insertSort.insert(3);*/

        insertSort.insert(3);
        insertSort.insert(1);
        insertSort.insert(4);
        insertSort.insert(6);
        insertSort.insert(9);
        insertSort.insert(8);
        insertSort.insert(0);
        insertSort.insert(5);
        insertSort.insert(2);
        insertSort.insert(7);

        insertSort.display();
        insertSort.insertSort();
        insertSort.display();
    }

}
