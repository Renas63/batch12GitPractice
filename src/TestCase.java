import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestCase {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println("Before "+list); // output[A,B,C,A]
        Set<String> listWithoutDuplicates = new LinkedHashSet<String>(list);
        list.clear();
        list.addAll(listWithoutDuplicates);
        System.out.println("list without duplicates : " + list);// output[A,B,C]

    }
}
