import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box = new Box();
        System.out.println("Введите высоту: ");
        box.setHeight(scanner.nextDouble());
        System.out.println("Введите длинну: ");
        box.setLength(scanner.nextDouble());
        System.out.println("Введите ширину: ");
        box.setWidth(scanner.nextDouble());
        System.out.println("Объём равен: ");
        System.out.println(box.getVolume());
    }
}