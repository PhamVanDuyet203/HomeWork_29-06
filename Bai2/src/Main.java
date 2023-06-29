import javax.security.sasl.SaslClient;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

        System.out.println("Nhập số thành phố: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên của thành phố thứ: " + (i+1) + ": ");
            String city = input.nextLine();
            cities.add(city);
        }

        System.out.println("Danh sách thành phố vừa nhập: " + cities);

        System.out.println("Danh sách thành phố sau khi sắp xếp tăng dần: ");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}