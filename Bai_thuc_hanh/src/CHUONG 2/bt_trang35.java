import java.util.Scanner;

public class bt_trang35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int stnhat, sthai;
        System.out.println("nhap so thu nhat :");
        stnhat= sc.nextInt();
        System.out.println("nhap so thu hai :");
        sthai= sc.nextInt();
        if (stnhat > sthai) {
            System.out.println("so nhon hon la :" +sthai);
        }else{
            System.out.println("so nhon hon la :" +stnhat);
        }
    }
}
