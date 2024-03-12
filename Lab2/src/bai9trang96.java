import java.util.Scanner;

public class bai9trang96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xau;
        int kiTuThuong = 0, kiTuHoa = 0 , so = 0;
        System.out.println("nhap chuoi : ");
        xau = sc.nextLine();
        System.out.println(" cac ki tu trong chuoi la :"  );
        for(int i=0; i < xau.length() ; i++){
            if (xau.charAt(i) >= 'a' && xau.charAt(i) <='z') {
                kiTuThuong +=1;
            }
            if (xau.charAt(i) >= 'A' && xau.charAt(i) <='Z') {
                kiTuHoa +=1;
            }
            if (xau.charAt(i) >= '0' && xau.charAt(i) <='9') {
                so +=1;
            }
        }
            System.out.println("so ki tu thuong : " +kiTuThuong);
            System.out.println("so ki tu in hoa : " +kiTuHoa);
            System.out.println("so ki tu la so : " +so);

    }
}
