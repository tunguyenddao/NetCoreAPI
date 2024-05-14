package phthuckhoitao;

import java.util.Scanner;

public class hinhtron {
    
        
        final float pi = 3.14f;
        float r, CV, S;
    public void hinhtron(){
        
    }
    public void hinhtron(float r){

    }
    public void nhap(){
        System.out.println("nhap ban kinh : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinh(){
        CV = pi * 2 * r;
        S = pi * r * r;
    }
    public void in(){
        System.out.println("Chu Vi hinh tron la : " +CV);
        System.out.println("Dien Tich hinh tron la : " +S);
    }
}
