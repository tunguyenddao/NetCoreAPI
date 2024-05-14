package SETTER__GETTER;

public class hinhtron {
     final float pi = 3.1412f;
    private double R;
    public   void setbankinh(double R){
        this.R= R;
    }
    public double getbankinh(){
        return R;
    }
    public double tinhS(){
        return pi*R*R;

    }
    public double tinhCV(){
        return pi*R*2;
    }
}
