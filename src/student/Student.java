package student;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Bela", 10);
        studentMap.put("Ana", 8);
        studentMap.put("Marcel", 4);
        studentMap.put("Dan", 4);
        studentMap.put("Maria", 7);

        System.out.println(studentMap);

        int max = 0;
        String name = "";
        for (Map.Entry<String, Integer> highestStudent : studentMap.entrySet()) {
            if (highestStudent.getValue() > max) {
                max = highestStudent.getValue();
                name = highestStudent.getKey();
            }
        }
        System.out.println("The student with the highest grade is: " + name + ", grade: " + max);

    }
}
