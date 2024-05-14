package person;
import java.util.Scanner;

public class SV {
    String hovaten, MSV;
    int NS;
    public  SV(){
        NS = 2004;
        hovaten = "H K T";
        MSV = "01929292";
    }

    public void nhapthongtin(){
        System.out.println("nhap ho va ten : ");
        Scanner sc = new Scanner(System.in);
        hovaten = sc.nextLine();
        System.out.println("nhap MSV : ");
        MSV = sc.nextLine();
        System.out.println("nhap nam sinh : ");
        NS = sc.nextInt();
        
      
    }
    public void in(){
        System.out.println("ten cua ban la :" + hovaten + "  sinh nam : " +NS + "  MSV : " + MSV);
    }
   
}
