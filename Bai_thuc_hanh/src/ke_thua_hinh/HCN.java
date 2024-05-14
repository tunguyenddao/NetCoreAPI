package ke_thua_hinh;

import java.util.Scanner;

public class HCN extends hinhhoc {
    public float dai,rong;
    HCN(){
        ten="Hinh chu nhat";
      
        
    }
    public void nhapChieuDai(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Chieu dai =");
        dai=sc.nextFloat();
       
    }
    public void nhapChieuRong(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Chieu rong =");
        rong=sc.nextFloat();
       
    }
    public float tinhChuVi(){
        return CV=(dai+rong)*2;
      
    }
    public float tinhDienTich(){
       return  S=dai*rong;
       
    }

    

    
}