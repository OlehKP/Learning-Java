import java.util.HashMap;
import java.util.Map;

public class Card_Index {
    static void main() {
        Map<String, Integer> studentAge = new HashMap<>();
        studentAge.put("Іван", 20);
        studentAge.put("Марія", 21);
        studentAge.put("Олексій", 19);
        System.out.println(studentAge);
    }
}
