package ke_thua_hinh;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieuCao;
    
    hinhtru(){
        ten="Hinh Tru";


    }

   
    public void nhap() {
       
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Chieu cao =");
        chieuCao = sc.nextFloat();

    }
    public float tinhTheTich(){
       return V=Pi*banKinh*banKinh*chieuCao;
    }


}