import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * bai10trang96
 */
public class bai10trang96 {
    public static void main(String[] args) {
        // public boolean find()
        int dem = 0;
        char kitu;
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("nhap chuoi : ");
        chuoi = sc.nextLine();
        System.out.println("nhap ki tu can dem ");
        kitu = sc.nextLine().charAt(0);
        System.out.println(kitu);

        
        Pattern pattern = Pattern.compile(String.valueOf(kitu));
        Matcher matcher = pattern.matcher(chuoi);
        while (matcher.find()) {
        dem++;
        }   
        System.out.println("so lan ki tu " +kitu +"xuat hien la :" +dem );
    }
}