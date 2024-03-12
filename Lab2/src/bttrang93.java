import java.util.Scanner;

public class bttrang93 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int tuoi = 0;
        System.out.println(" nhap ten :");
        String ten = sc.nextLine();
        System.out.println(" nhap nam sinh:");
            int namsinh = sc.nextInt();
            tuoi = 2024 - namsinh;
        if (tuoi < 16 ) {
            System.out.println(" Ban" +ten +"o do tuoi vi thanh nien");
            
        }else if (16 <= tuoi && tuoi < 18 ) {
            System.out.println(" Ban" +ten +"o do tuoi truong thanh");
        }else{
            System.out.println(" Ban" +ten +"da gia");
        }


}
}