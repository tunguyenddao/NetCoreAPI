package ke_thua_hinh;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float banKinh;
     
    public hinhtron(){
        ten="Hinh Tron";

    }
    public  hinhtron(String ten,float banKinh){
        this.ten=ten;
        this.banKinh=banKinh;
    }
   
    public void nhap(){
       
        Scanner sc =new Scanner(System.in);
        System.out.print("Ban kinh cua hinh tron la :");
        banKinh=sc.nextFloat();
        
    }

    public float tinhChuVi(){
        return CV=Pi*2*banKinh;
       
    }
    public float tinhDienTich(){
         return S=super.Pi*banKinh*banKinh;
       

    }


    
}