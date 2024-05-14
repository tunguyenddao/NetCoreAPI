package Lop_ke_thua;

abstract class Bike {
    abstract void age();
}

 class Honda extends Bike {
    void age(){
        System.out.println("moi su dung");
    }
    public static void main(String[] args) {
        Bike xe = new Honda();
        xe.age();
    }

}
