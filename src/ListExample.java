import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();


        students.add("Oliver");
        students.add("Alex");
        students.add("Robert");
        System.out.println("Початковий список: " + students);

        // Редагування елемента
        students.set(1, "Dima");
        System.out.println("Після редагування: " + students);

        // Видалення елемента
        students.remove("Robert");
        System.out.println("Після видалення: " + students);

        // Отримання елемента за індексом
        String student = students.get(0);
        System.out.println("Отриманий елемент: " + student);
    }
}
