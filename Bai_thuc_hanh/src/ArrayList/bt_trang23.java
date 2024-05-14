package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> ht = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a, so;
        System.out.println("nhap so phan tu cua mang");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("ht[" + i + "] = ");
            so = sc.nextInt();
            ht.add(so);
        }
        ht.sort(null);
        System.out.print("so lon nhat la : ");
        System.out.print(ht.get(a - 1));
    }
}
