import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num / 100 + "00+" + (num % 100) / 10 + "0+" + num % 10);
    }
}
