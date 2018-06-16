package cn.tiakon.java.code.chapter01;

public class D05_ClassDataApp {
    public static void main(String[] args) {
        D05_ClassDataAraay dataAraay = new D05_ClassDataAraay(50);
        dataAraay.insert("Evans", "Patty", 24);
        dataAraay.insert("Smith", "Lorraine", 24);
        dataAraay.insert("Yee", "Tom", 24);
        dataAraay.insert("Adams", "Henry", 24);
        dataAraay.insert("Hashimoto", "Sato", 24);
        dataAraay.insert("Stimson", "Henry", 24);
        dataAraay.insert("Velasquez", "Jose", 24);
        dataAraay.insert("Lamarque", "Henry", 24);
        dataAraay.insert("Vang", "Minh", 24);
        dataAraay.insert("Creswell", "Luinda", 24);

        dataAraay.displayAll();

        String searchKey = "Adams";
        D05_Person resultPerson = dataAraay.find(searchKey);

        if (resultPerson != null) {
            dataAraay.delete("Adams");
        } else {
            System.out.println("can't  found ");
        }
        dataAraay.displayAll();
    }
}
