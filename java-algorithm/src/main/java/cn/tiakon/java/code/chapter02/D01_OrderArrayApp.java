package cn.tiakon.java.code.chapter02;

public class D01_OrderArrayApp {
    public static void main(String[] args) {
        D01_OrderArray orderArray = new D01_OrderArray(50);

        for (int i = 0; i < 10; i++) {
            orderArray.insert(i);
        }
/*        orderArray.insert(33);
        orderArray.insert(22);
        orderArray.insert(66);
        orderArray.insert(11);

        orderArray.insert(44);
        orderArray.insert(88);
        orderArray.insert(77);
        orderArray.insert(0);
        orderArray.display();*/

        System.out.println("searchKey index: " + orderArray.find(9));
        System.out.println("find count: " + orderArray.getFindCount());

        orderArray.deleteByBinSearch(5);
        orderArray.display();
        orderArray.deleteByLinear(4);
        orderArray.display();
    }
}
