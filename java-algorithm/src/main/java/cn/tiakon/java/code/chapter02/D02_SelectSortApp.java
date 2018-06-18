package cn.tiakon.java.code.chapter02;

public class D02_SelectSortApp {
    public static void main(String[] args) {
        D02_SelectSort selectSortApp = new D02_SelectSort(20);

        selectSortApp.insert(1);
        selectSortApp.insert(5);
        selectSortApp.insert(8);
        selectSortApp.insert(4);
        selectSortApp.insert(3);
        selectSortApp.insert(6);
        selectSortApp.insert(9);
        selectSortApp.insert(0);
        selectSortApp.insert(2);
        selectSortApp.insert(7);

        selectSortApp.display();
        selectSortApp.selectionSort();
        selectSortApp.display();
    }
}
