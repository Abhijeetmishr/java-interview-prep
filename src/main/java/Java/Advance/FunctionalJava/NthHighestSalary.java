package Java.Advance.FunctionalJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        
        map.put("John", 1000);
        map.put("Don", 1200);
        map.put("Max", 1100);
        map.put("Aminni", 1100);

        System.out.println(FindNthHighestSalary(2, map));
    }

    public static Map.Entry<Integer, List<String>> FindNthHighestSalary(int nth, Map<String, Integer> map) {
        return map.entrySet().stream().collect(
            Collectors.groupingBy(Map.Entry :: getValue,
                Collectors.mapping(Map.Entry :: getKey, Collectors.toList()))
        ).entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
        .collect(Collectors.toList())
        .get(nth-1);
    }
}
