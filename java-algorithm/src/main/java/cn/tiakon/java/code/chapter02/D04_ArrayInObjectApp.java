package cn.tiakon.java.code.chapter02;

public class D04_ArrayInObjectApp {
    public static void main(String[] args) {

        D04_ArrayInObject arrayInObject = new D04_ArrayInObject(20);

        arrayInObject.insert("Evans", "Patty", 9);
        arrayInObject.insert("Smith", "Lorraine", 14);
        arrayInObject.insert("Yee", "Tom", 77);
        arrayInObject.insert("Adams", "Henry", 62);
        arrayInObject.insert("Hashimoto", "Sato", 24);
        arrayInObject.insert("Stimson", "Henry", 36);
        arrayInObject.insert("Velasquez", "Jose", 54);
        arrayInObject.insert("Lamarque", "Henry", 84);
        arrayInObject.insert("Vang", "Minh", 49);
        arrayInObject.insert("Creswell", "Luinda", 27);

        System.out.println("未排序之前:");
        arrayInObject.displayAll();
        arrayInObject.insertSortByLastName();
        System.out.println("按照姓名排序:");
        arrayInObject.displayAll();
        arrayInObject.insertSortByAge();
        System.out.println("按照年龄排序:");
        arrayInObject.displayAll();
    }
}
