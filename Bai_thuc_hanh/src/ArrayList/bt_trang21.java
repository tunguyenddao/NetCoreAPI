package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class bt_trang21 {
    public static void main(String[] args) {
    ArrayList<String> arrayListString = new ArrayList<>();
    ArrayList<Character> backupCharacters = new ArrayList<>();

    arrayListString.add("hom");
    backupCharacters.add(' ');
    arrayListString.add("nay");
    backupCharacters.add(' ');
    arrayListString.add("la");
    backupCharacters.add(' ');
    arrayListString.add("thu");
    backupCharacters.add(' ');
    arrayListString.add("tu");
    System.out.print("cac phan tu trong mang la : ");
    for(int i = 0; i < arrayListString.size(); i++){
        System.out.print(arrayListString.get(i) );
        System.out.print(backupCharacters.get(0));
    }
    

    
    }
}
