import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.print(num + " is not a Prime Number");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is not a Prime Number");
            }
        }
    }
}
