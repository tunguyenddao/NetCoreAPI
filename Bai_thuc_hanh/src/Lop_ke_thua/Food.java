package Lop_ke_thua;

/**
 * Food
 */
public interface Food {
    void cook();
}
   class vegetable implements Food{
    public void cook(){
        System.out.println(" mon luoc");
    }
    public static void main(String[] args) {
        vegetable thucan = new vegetable();
        thucan.cook();
    }
   }
