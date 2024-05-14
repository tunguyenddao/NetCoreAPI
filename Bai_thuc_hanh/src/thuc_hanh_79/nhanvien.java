package thuc_hanh_79;

import java.util.Scanner;

public class nhanvien {
     protected String ten, loainv;
     protected long luong;
     public nhanvien(){}
     public  nhanvien(String ten){
        this.ten = ten;
     }
     protected String loainv(){

       return " " ;

     }
     public void inthongtin(){
        System.out.println("Ten nv la:" +ten);
        System.out.println("Loai nv :" + loainv);
        System.out.println("luong : "  +luong);
     }
}
