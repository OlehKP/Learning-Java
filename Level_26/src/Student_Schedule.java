
import java.util.LinkedList;
import java.util.List;

public class Student_Schedule {
    static void main() {
        List<String> subjects = new LinkedList<>();
        subjects.add("Математика");
        subjects.add("Фізика");
        subjects.add("Інформатика");
        subjects.add(0, "Англійська");
        subjects.remove("Фізика");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}
