package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
<<<<<<< HEAD

=======
>>>>>>> 75be5418d8c2d625251a3de376f97003ce8c5d6d
public class demo3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> ht = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a, so, max;
        System.out.println("nhap so ptu cua mang");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("ht[" + i + "] = ");
            so = sc.nextInt();
            ht.add(so);
        }
        max = ht.get(0);
        for (int i = 0; i < ht.size(); i++) {
            if (ht.get(i) > max) {
                max = ht.get(i);
            }
        }
        System.out.print("phan tu lon nhat : ");
        System.out.println(max);
    }
}
