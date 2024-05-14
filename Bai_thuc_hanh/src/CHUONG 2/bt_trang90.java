import java.util.Scanner;

public class bt_trang90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char kiTu;
        System.out.println("nhap chuoi : ");
        s = sc.nextLine();
        System.out.println(" cac ki tu trong chuoi la :"  );
        for(int i=0; i < s.length() ; i++){
            kiTu=s.charAt(i);
            System.out.println(kiTu);
        }
    }
}