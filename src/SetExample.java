import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class SetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Софія", "Чарльз", "Макс", "Льюїс", "Карлос","Діма");


        HashSet<String> uniqueNames = new HashSet<>(names);
        System.out.println("Унікальні імена: " + uniqueNames);



        System.out.println("Кількість унікальних імен: " + uniqueNames.size());


        boolean containsName = uniqueNames.contains("Діма");
        System.out.println("Чи є у списку ваше ім'я? " + containsName);
    }
}
