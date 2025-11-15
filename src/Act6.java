import java.util.*;
import java.util.stream.*;

public class Act6 {
    static class Product {
        String name;
        double price;
        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return name + " $" + price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("Keyboard", 45.00),
            new Product("Monitor", 120.50),
            new Product("Mouse", 25.75),
            new Product("Desk Lamp", 30.10),
            new Product("Webcam", 65.00),
            new Product("Headset", 80.00)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price threshold (e.g. 50.00): ");
        double threshold = scanner.nextDouble();
        scanner.close();

        long count = products.stream()
            .filter(p -> p.price > threshold)
            .count();

        System.out.println("Products more expensive than " + threshold + ": " + count);
    }
}