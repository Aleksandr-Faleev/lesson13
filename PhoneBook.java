import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Хряпа", "953-092-28-97");
        book.add("Харламов", "918-174-31-21");
        book.add("Хряпа", "880-555-55-55");
        book.add("Батрудинов", "918-123-21-55");
        book.add("Воля", "952-123-22-22");

        System.out.println("Номера телефонов для Хряпы:");
        System.out.println(book.get("Хряпа"));

        System.out.println("Номера телефонов для Харламова:");
        System.out.println(book.get("Харламов"));

        System.out.println("Номера телефонов для Батрудинова:");
        System.out.println(book.get("Батрудинов"));

        System.out.println("Номера телефонов для Воли :");
        System.out.println(book.get("Воля"));
    }
}

