package Lop_Ke_Thua;

/**
 * Food
 */
public interface Food {
    void cook();
}
   class vegetable implements Food{
    public void cook(){
        System.out.println("luoc");
    }
    public static void main(String[] args) {
        vegetable thucan = new vegetable();
        thucan.cook();
    }
   }
