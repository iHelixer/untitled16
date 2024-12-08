import java.util.HashMap;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Додавання записів
        phoneBook.put("Dima", "123-456-789");
        phoneBook.put("Robert", "987-654-321");
        phoneBook.put("Nico", "456-789-123");
        System.out.println("Телефонний довідник: " + phoneBook);

        // Пошук номера за ім'ям
        System.out.print("Введіть ім'я для пошуку номера: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("Номер телефону: " + phoneBook.get(name));
        } else {
            System.out.println("Ім'я не знайдено.");
        }

        // Видалення запису за ім'ям
        System.out.print("Введіть ім'я для видалення запису: ");
        String nameToDelete = scanner.nextLine();
        if (phoneBook.remove(nameToDelete) != null) {
            System.out.println("Запис видалено.");
        } else {
            System.out.println("Ім'я не знайдено.");
        }

        System.out.println("Оновлений телефонний довідник: " + phoneBook);
    }
}
