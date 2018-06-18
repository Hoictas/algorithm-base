package cn.tiakon.java.code.chapter01;

/**
 * Desc : 面向过程的 java 数组的简单操作
 * User : By Tiakon
 * Time : 2018/6/16 2:15
 */
public class D02_LowArrayApp {

    public static void main(String[] args) {
        D02_LowArray lowArray = new D02_LowArray(100);
        int count = 0;

        //当前数组中的数据
        int nElemts = 0;

        lowArray.setElem(0, 1);
        lowArray.setElem(1, 221);
        lowArray.setElem(2, 21);
        lowArray.setElem(3, 71);
        lowArray.setElem(4, 61);
        lowArray.setElem(5, 11);
        lowArray.setElem(6, 14);
        lowArray.setElem(7, 21);
        lowArray.setElem(8, 34);
        lowArray.setElem(9, 67);

        nElemts = 10;

        //查询所有
        for (count = 0; count < nElemts; count++) {
            System.out.print(lowArray.getElem(count) + ",");
        }

        //查询某个值
        int searchNumber = 2213;

        for (count = 0; count < nElemts; count++) {
            if (searchNumber == lowArray.getElem(count)) {
                break;
            }
        }
        System.out.println();
        if (nElemts == count) {
            System.out.println("Can't Found ");
        } else {
            System.out.println("Can Found " + lowArray.getElem(count));
        }

        //删除71
        int deleteNumber = 71;

        for (count = 0; count < nElemts; count++) {
            if (deleteNumber == lowArray.getElem(count)) {
//                System.out.print(lowArray.getElem(count));
                break;
            }
        }
        for (int i = count; i < nElemts; i++) {
            lowArray.setElem(i, lowArray.getElem(i + 1));
        }

        nElemts--;

        //查询所有
        for (count = 0; count < nElemts; count++) {
            System.out.print(lowArray.getElem(count) + ",");
        }

    }
}
