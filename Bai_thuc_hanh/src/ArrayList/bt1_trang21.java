package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class bt1_trang21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        ArrayList<Character> backupCharacters = new ArrayList<>();

        backupCharacters.add('0');
        backupCharacters.add('8');
        backupCharacters.add(' ');
        backupCharacters.add('/');
        backupCharacters.add(' ');
        backupCharacters.add('0');
        backupCharacters.add('5');
        backupCharacters.add(' ');
        backupCharacters.add('/');
        backupCharacters.add(' ');
        backupCharacters.add('6');
        arrayListInteger.add(2004);
        backupCharacters.remove(10);

        System.out.println("ngay sinh la : ");
        for (int i = 0; i < backupCharacters.size(); i++) {
            System.out.print(backupCharacters.get(i));

        }

        System.out.print(arrayListInteger.get(0));

    }
}
