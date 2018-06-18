package cn.tiakon.java.code.chapter01;

public class D03_HighArrayApp {
    public static void main(String[] args) {
        int size = 100;
        D03_HighArray highArray = new D03_HighArray(size);

        highArray.insert(99);
        highArray.insert(55);
        highArray.insert(22);
        highArray.insert(66);
        highArray.insert(11);
        highArray.insert(77);
        highArray.insert(88);
        highArray.insert(33);
        highArray.insert(44);
        highArray.insert(0);

        highArray.queryAll();
        int searchKey = 100;
        if (highArray.find(searchKey)) {
            System.out.println("can found " + searchKey);
        } else {
            System.out.println("can't found " + searchKey);
        }

        highArray.delete(55);
        highArray.delete(22);
        highArray.delete(99);

        highArray.queryAll();
    }
}
