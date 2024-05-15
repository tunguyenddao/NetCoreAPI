package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        String ptu, bo;
        HashSet<String> HsString = new HashSet<>(16, 0.75f);
        Scanner sc = new Scanner(System.in);
        HsString.add("du");
        HsString.add("bao");
        HsString.add("thoi");
        HsString.add("tiet");
        HsString.add("hom");
        HsString.add("nay");
        HsString.add("troi");
        HsString.add("mua");

        // hiển thị
        System.out.println("Cac ptu trong HashSetString la : ");
        System.out.println(HsString);

        // thêm phần tử mới
        System.out.println("nhap ptu them moi : ");
        ptu = sc.nextLine();
        if (!HsString.contains(ptu)) {
            HsString.add(ptu);
            System.out.println("da them thanh cong");
            System.out.println("Cac ptu moi trong HashSetString la ");
            System.out.println(HsString);

        } else {
            System.out.println("them ptu moi that bai");
            System.out.println(" ptu " + ptu + " da ton tai ");
        }

        //xóa phần tử
        System.out.println("nhap ptu can xoa : ");
        bo = sc.nextLine();
        if (HsString.contains(bo)) {
            HsString.remove(bo);
            System.out.println("xoa ptu thanh cong");
            System.out.println("cac ptu sau khi xoa la :");
            System.out.println(HsString);
        }else{
            System.out.println("xoa ptu that bai");
            System.out.println("ptu " +bo +" khong ton tai");
        }
    }
}
