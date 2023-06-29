import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        List<Integer> lstSoNguyen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + ": ");
            int num = scanner.nextInt();
            lstSoNguyen.add(num);
        }

        System.out.println("Danh sách vừa nhập: " + lstSoNguyen);

        Collections.sort(lstSoNguyen);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + lstSoNguyen);
        }
}