package HashMaps;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HashMap employees = new HashMap(3);
        employees.assign("34-567", "Mara");
        System.out.println(Arrays.toString(employees.hashmap));
    }
}
