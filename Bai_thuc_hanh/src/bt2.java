import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) throws Exception {
        double hesoa, hesob, hesoc, x1, x2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap he so a =");
        hesoa = sc.nextDouble();
        System.out.println("nhap he so b =");
        hesob = sc.nextDouble();
        System.out.println("nhap he so c =");
        hesoc = sc.nextDouble();
        if (hesoa == 0) {
            if (hesob == 0) {
                System.out.println("phuong trinh vo nghiem");
            }else {
            System.out.println("nghiem cua phuong trinh la : x = " +(-hesoc/hesob));
                    }
        }
        
        double delta = hesob*hesob - 4*hesoa*hesoc;
        // float x1, x2;
        if (delta > 0 ) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));

            System.out.println("phuong trinh co  2 nghiem  " +"x1 ="x1 +"x2 = "x2);
            // System.out.println("phuong trinh co  2 nghiem : x2 = " +x2);
        }else if (delta == 0) {   
            System.out.println("phuong trinh co  nghiem  kep : x = " +(-hesob/a));
            
        }else (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        }

    }
}
