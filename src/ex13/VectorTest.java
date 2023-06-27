package ex13;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // Vector vc = new Vector();
        Vector<String> vc = new Vector<>();

        vc.add("Hello World!");
        vc.add("10");
        vc.add("20");
        // vc.add(new Integer(10));
        // vc.add(20);

        System.out.println("Vector Size :" + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("Vector element " + i + ": " + vc.get(i));
        }
        // String s = (String) vc.get(0);
    }
}
