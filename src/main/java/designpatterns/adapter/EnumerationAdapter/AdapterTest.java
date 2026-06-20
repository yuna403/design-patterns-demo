package designpatterns.adapter.EnumerationAdapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class AdapterTest {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Item 1");
        vec.add("Item 2");
        Enumeration<String> enumeration = vec.elements();
        Iterator<String> iterator = new EnumerationAdapter<>(enumeration);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
