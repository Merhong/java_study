package ex13;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();               // 순서 없음
        // LinkedHashSet<String> set = new LinkedHashSet<>();   // 삽입(입력)된 순서대로
        // TreeSet<String> set = new TreeSet<>();                  // 값에 따라 순서 결정, 여기선 알파벳

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println(("Ham도 포함되어 있음"));
        }
    }
}
