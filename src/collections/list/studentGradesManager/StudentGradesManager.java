package collections.list.studentGradesManager;

import java.util.*;

public class StudentGradesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map <String, List<Integer>> students = new HashMap<>();

        while (true) {
            System.out.println("\n1. Добавить студента \n2. Добавить оценку \n3. Показать оценки \n4. Средня оценка \n5. Выход");
            System.out.println("Выбор : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите студента : ");
                    String nameStudents = scanner.nextLine();
                    // логика
                    students.putIfAbsent(nameStudents, new ArrayList<>());
                    break;
                case 2:
                    System.out.println("Имя студента : ");
                    nameStudents = scanner.nextLine();
                    // логика
                    if (!students.containsKey(nameStudents)) {
                        System.out.println("Студент не найден !!! ");
                        break;
                    }
                    System.out.println("Добавить оценку (0 - 100) : ");
                    int grade = scanner.nextInt();
                    if (grade >= 0 && grade <= 100) {
                        students.get(nameStudents).add(grade);
                        System.out.println("Оценка добавлена !!! ");
                    } else {
                        System.out.println("Неверная оценка !!! ");
                    }
                    break;
                case 3:
                    System.out.println("Показ оценки ");
                    for (String student : students.keySet()) {
                        System.out.println(student + " : " + students.get(student));
                    }
                    // логика
                    break;
                case 4:
                    System.out.println("Имя студента : ");
                    nameStudents = scanner.nextLine();
                    List <Integer> grades = students.get(nameStudents);
                    if (grades == null || grades.isEmpty()) {
                        System.out.println("Нет оценок для студента !!! ");
                    }
                    double avg = grades.stream().mapToInt(i -> i).average().orElse(0);
                    System.out.printf("Средняя оценка для %s : %.2f\n", nameStudents, avg);
                    // логика
                    break;
                    case 5:
                        System.out.println("Пока !!! ");
                        break;
                default:
                    System.out.println("Неверный выбор !!! ");

            }
        }
    }
}
