import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListTest {
    public static void main(String[] args){
        ArrayList ar = new ArrayList<>();
        ar.add("azeer");
        ar.add("Ravi");
        ar.add("sumanth");
        ar.add(2);
        ar.add(45);
        System.out.println(ar.remove(2));
        System.out.println(ar);
        System.out.println(ar);
        System.out.println(ar.get(3));
        System.out.println(ar.indexOf("azeer"));
        System.out.println("===========================================");
        LinkedList aa = new LinkedList<>();
        aa.add("azeer2");
        aa.add("Ravi2");
        aa.add("sumanth2");
        aa.add(25);
        aa.add(5);
        aa.addFirst(ar);
        System.out.println(aa.removeLast());
        System.out.println(aa.getLast());
        System.out.println(aa);
    }
}
