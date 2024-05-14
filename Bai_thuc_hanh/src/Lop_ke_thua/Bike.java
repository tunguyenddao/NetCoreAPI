package Lop_ke_thua;

abstract class Bike {
    abstract void age();
}

 class Honda extends Bike {
    void age(){
        System.out.println("xe moi duoc su dung");
    }
    public static void main(String[] args) {
        Bike xe = new Honda();
        xe.age();
    }

}
