import java.util.Scanner;


public class vidukhaibaolop {
    float R, CV=0, S=0;
    final float pi = 3.14f ;
    void tinhCV(){
        CV = R*pi*2;
    }
    void tinhS(){
        S=R*R*pi;
    }
    void nhapBK(){
        System.out.println("moi ban nhap ban kinh : ");
        Scanner sc = new Scanner(System.in);
        R = sc.nextFloat();
    }
    void inCV(){
        System.out.println("Chu vi hinh tron la :" +CV);
       
    }
    void inS(){
        System.out.println("Dien tich hinh tron la :" +S);
    }
    
}
