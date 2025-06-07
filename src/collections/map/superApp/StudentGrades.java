package collections.map.superApp;
import java.util.*;

public class StudentGrades {
    private final Map<String, List<Integer>> grades = new HashMap<>();
    StudentGrades() {
        grades.put("Ivan", List.of(5, 4, 3));
        grades.put("Petar", List.of(3, 4, 5));
        grades.put("Gosho", List.of(3, 3, 2));
    }

    public  void run (Scanner scanner) {
        System.out.println("Введите имя студента : ");
        String name = scanner.nextLine();

        if (grades.containsKey(name)) {
            List<Integer> studentGrades = grades.get(name);
            double avg = studentGrades.stream().mapToInt(i -> i).average().orElse(0);
            System.out.println("Оценки : " + studentGrades + " Срденяя оценка : " + avg);
        } else {
            System.out.println("Добавить нового студента ? (y/n) ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                System.out.println("Введите оценки через пробел: ");
                String[] parts = scanner.nextLine().split(" ");
                List<Integer> newGrades = new ArrayList<>();
                for (String part : parts) newGrades.add(Integer.parseInt(part));
                grades.put(name, newGrades);
                System.out.println("Добавлено!");
            }
        }
    }
}
