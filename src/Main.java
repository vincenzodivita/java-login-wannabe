import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Password Request
        System.out.println("Insert password");
        String userPswrd = scanner.nextLine();

        // If Else statement
        if(userPswrd.equals("PincoPallino1")) {
            System.out.println("Correct password");
        }else {
            System.out.println("Wrong password");
        }
    }
}
