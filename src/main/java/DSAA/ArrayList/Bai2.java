package DSAA.ArrayList;
import java.util.*;

//Search phan tu trong mang
//IndexOf()
//Contains()
public class Bai2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ha");
        arrayList.add("Thanh");
        arrayList.add("Hoa");
        arrayList.add("Quy");
        arrayList.add("Viet");

        System.out.println("Cac phan tu co trong mang la: " + arrayList);
        // Tim kiem phan tu Thanh co trong mang
        boolean check = arrayList.contains("Thanh");
            if (check==true){
                // Hien thi vi tri cua phan tu sau khi tim thay
                System.out.println("Hien thi vi tri cua phan tu co ten Thanh:" + arrayList.indexOf("Thanh"));
            }
            else {
                // Neu khong tim thay phan tu
                System.out.println("Khong tim thay phan tu");
            }

    }
}
