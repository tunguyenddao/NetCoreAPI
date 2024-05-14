package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
<<<<<<< HEAD
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
        System.out.print("cac phan tu trong string la : ");
        for (int i = 0; i < arrayListString.size(); i++) {
            System.out.print(arrayListString.get(i));
            System.out.print(backupCharacters.get(0));
        }

=======
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
    System.out.print("cac phan tu trong string la : ");
    for(int i = 0; i < arrayListString.size(); i++){
        System.out.print(arrayListString.get(i) );
        System.out.print(backupCharacters.get(0));
    }
    

    
>>>>>>> 75be5418d8c2d625251a3de376f97003ce8c5d6d
    }
}
