package kethuahinh;

import java.util.Scanner;

public class hinhhoc {
    final float Pi = 3.14f;
    public String ten;
    public float CV;
    public float S;
    public float V;

    
   
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Ten :");
        ten=sc.nextLine();
        System.out.print("Chu vi :");
        CV=sc.nextFloat();
        System.out.print("Dien Tich :");
        S=sc.nextFloat();
        System.out.print("The tich :");
        V=sc.nextFloat();
    }
    public void xuatTen(){
        System.out.println("Ten :"+ten);

    }
    public void inChuVi (){
        System.out.println("Chu vi :"+CV);

    }
    public void inDienTich (){
        System.out.println("Dien Tich :"+S);

    }
    public void inTheTich (){
        System.out.println("The Tich :"+V);

    }



}