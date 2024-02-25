import java.util.Scanner;

public class bai8trang94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong=0;
    
        System.out.println("nhap n");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i= 0; i< n; i++){
            System.out.println("nhap ptu thu " +(i+1));
            a[i] = sc.nextInt();
            tong +=a[i];
        }
        System.out.println("trung binh cong la: " +(float)tong/n);
    }
}
