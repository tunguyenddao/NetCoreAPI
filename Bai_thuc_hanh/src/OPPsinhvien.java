import java.util.Scanner;

public class OPPsinhvien {
    String hovaten, MSV;
    int tuoi=0, ns;

    void nhap() {
        System.out.println("moi  nhap ho va ten : ");
        Scanner sc = new Scanner(System.in);
        hovaten = sc.nextLine();

        System.out.println("moi nhap ma sinh vien : ");

        MSV = sc.nextLine();

        System.out.println("moi ban nhap nam sinh : ");

        ns = sc.nextInt();
    }

    void tinhtuoi() {
        tuoi = 2024 - ns;
    }
    void in(){
        System.out.println(" ten cua ban la : " + hovaten);
        System.out.println(" msv cua ban la : " + MSV);
        System.out.println(" tuoi cua ban la : " + tuoi);
    }
}
