package collections.map.studentGrades;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Программа предназначена для хранения,
// обработки и отображения информации об оценках студентов.
// Она демонстрирует, как с помощью коллекций Java можно эффективно представлять и обрабатывать табличные данные
// в данном случае, списки оценок по каждому студенту.

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, List<Integer>> grades = new HashMap<>();

        grades.put("Ivan", Arrays.asList(5, 4, 3));
        grades.put("Petar", Arrays.asList(3, 4, 5));
        grades.put("Gosho", Arrays.asList(3, 3, 2));

        for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
            String student = entry.getKey();
            List<Integer> studentGrades = entry.getValue();
            double avg = studentGrades.stream().mapToInt(i -> i).average().orElse(0);
            System.out.println("Студент : " + student + " оценки : " + studentGrades + " (средняя оценка : " + avg);
        }
    }
}
