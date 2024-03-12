import java.util.Scanner;

public class bai5trang94 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, tong = 0;
    do{
        System.out.println("nhap so :");
        n= sc.nextInt();
        tong = tong + n;
    }while(tong < 100);
    System.out.println("tong cac so vua nhap la :" +tong);
}}
