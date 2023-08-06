import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Scanner method
        Scanner scanner = new Scanner(System.in);

        // Password Request
        System.out.println("Insert password");
        String userPswrd = scanner.nextLine();
        
        // While cycle
        while (!userPswrd.equals("PincoPallino1")) {
            System.out.println("Wrong password\nInsert password");
            userPswrd = scanner.nextLine();
        };
        System.out.println("Correct password");

        scanner.close();
    }
}
