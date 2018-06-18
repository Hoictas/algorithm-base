package cn.tiakon.java.code.chapter02;

public class D01_BubbleSortApp {
    public static void main(String[] args) {
        D01_BubbleSort bubbleSort = new D01_BubbleSort(20);

        bubbleSort.insert(9);
        bubbleSort.insert(1);
        bubbleSort.insert(5);
        bubbleSort.insert(8);
        bubbleSort.insert(4);
        bubbleSort.insert(3);
        bubbleSort.insert(6);
        bubbleSort.insert(0);
        bubbleSort.insert(2);
        bubbleSort.insert(7);

        bubbleSort.display();
        bubbleSort.bubbleSort();
        bubbleSort.display();
    }
}
