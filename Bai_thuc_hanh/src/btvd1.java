import java.util.Scanner;

public class btvd1 {
    public static void main(String[] args) throws Exception {
        double hesoa, hesob, x1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap he so a =");
        hesoa = sc.nextDouble();
        System.out.println("nhap he so b =");
        hesob = sc.nextDouble();
        if (hesoa == 0) {
            System.out.println("khong phai phuong trinh bac 1");
            System.out.println("khong phai phuong trinh bac 2");
        }else {
            System.out.println("nghiem cua phuong trinh la : x = " +(-hesob/hesoa));
    }

    }
}
