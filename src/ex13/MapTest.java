package ex13;

import java.util.Map;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee"));  // key를 가지고 값을 참조

        // 모든 항목 방문
        for(String key: map.keySet()) {
            String value = map.get(key);
            System.out.println("key="+key+", value="+value);
        }

        map.remove("lim");                   // key값으로 항목 삭제
        map.put("choi", "password");   // 항목 대치 
        System.out.println(map);
    }
}