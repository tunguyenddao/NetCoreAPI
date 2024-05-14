import java.util.Scanner;

public class baitapt30 {
    public static void main(String[] args) {
        int n, tong = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("nhap so nguyen n : ");
        n = sc.nextInt();
        }while( n <= 0);
            
        
        while (n > 0) {
             
            
                tong += n%10;
                n /= 10;

                
            }
          System.out.println("tong cac chu so cua n la :" +(tong));
        }
        
    }

