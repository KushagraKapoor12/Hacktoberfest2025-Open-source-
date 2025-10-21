
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, sum = 0, d;
        while (n > 0) {
            d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
    }
}
