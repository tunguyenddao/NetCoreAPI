package LinkHashSet;
import java.util.LinkedHashSet; 
import java.util.Set;
public class demo {
    public static void main(String[] args) {
        Set<String> HSString = new LinkedHashSet<String>();
        HSString.add("hom");
        HSString.add("nay");
        HSString.add("la");
        HSString.add("thu");
        HSString.add("bay");

        for( String str : HSString){
            System.out.println(str);
        }
    }
}
