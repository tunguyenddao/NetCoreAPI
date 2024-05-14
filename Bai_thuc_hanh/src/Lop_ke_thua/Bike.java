package Lop_Ke_Thua;

abstract class Bike {
    abstract void age();
}

 class Honda extends Bike {
    void age(){
        System.out.println("moi duoc su dung");
    }
    public static void main(String[] args) {
        Bike xe = new Honda();
        xe.age();
    }

}
