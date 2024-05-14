import java.util.Scanner;

public class bt_trang81 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,m;
        System.out.println("nhap so dong cua mt :");
        m = sc.nextInt();
        System.out.println("nhap so cot cua mt :");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("nhap cac ptu cua mt :");
        for(int i=0; i < m; i++){
            for(int j=0; j < n;j++ ){
                System.out.println("a[" +i+ "][" +j +"]");
                a[i][j] = sc.nextInt();
            }
        }
        int max= a[0][0];
        for(int i=0; i < m; i++){
            for(int j=0; j < n;j++ ){
                if (max < a[i][j]) {
                    max= a[i][j];
                }
            }
        }
        System.out.println("ptu co gia tri lon nhat la : " +max);
    }
}
