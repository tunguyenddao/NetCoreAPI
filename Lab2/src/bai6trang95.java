import java.util.Scanner;

public class bai6trang95 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, gt=1;
        do{
            System.out.println("nhap n : ");
            n= sc.nextInt();
        }while(n<=0);
        do{
            gt = gt*n;
            n--;
        }while(n>0);
        System.out.println("giai thua la :" +gt);
    }
}