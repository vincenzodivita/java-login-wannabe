import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Password Request
        System.out.println("Insert password");
        boolean userPswrd = scanner.nextLine().equals("PincoPallino1");

        // Ternary Operator 
        System.out.println((userPswrd) ? "Correct password" : "Wrong password");
    }
}
