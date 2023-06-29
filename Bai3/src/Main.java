import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> countryMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng quốc gia (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập tên quốc gia thứ " + i + ": ");
            String countryName = scanner.nextLine();
            countryMap.put(i, countryName);
        }

        System.out.println("Danh sách vừa nhập:");
        for (int key : countryMap.keySet()) {
            String countryName = countryMap.get(key);
            System.out.println(key + ": " + countryName);
        }

        List<Map.Entry<Integer, String>> sortedEntries = new ArrayList<>(countryMap.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        System.out.println("Danh sách sau khi sắp xếp:");
        for (Map.Entry<Integer, String> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}