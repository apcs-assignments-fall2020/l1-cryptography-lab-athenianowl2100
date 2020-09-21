import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String newStr = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                ch -= 'a';
                ch += 3;
                ch %= 26;
                ch += 'a';
            }
            // Uppercase letters
            else if (ch >= 'A' && ch <= 'Z') {
                ch -= 'A';
                ch += 3;
                ch %= 26;
                ch += 'A';
            }
            
            newStr += ch;
        }

        return newStr;
    }

    public static String decryptCaesar(String message) {
        String newStr = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                ch -= 'a';
                ch += 26;
                ch -= 3;
                ch %= 26;
                ch += 'a';
            }
            // Uppercase letters
            else if (ch >= 'A' && ch <= 'Z') {
                ch -= 'A';
                ch += 26;
                ch -= 3;
                ch %= 26;
                ch += 'A';
            }
            
            newStr += ch;
        }

        return newStr;
    }

    public static String encryptCaesarKey(String message, int key) {
        String newStr = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                ch -= 'a';
                ch += (key % 26);
                ch %= 26;
                ch += 'a';
            }
            // Uppercase letters
            else if (ch >= 'A' && ch <= 'Z') {
                ch -= 'A';
                ch += (key % 26);
                ch %= 26;
                ch += 'A';
            }
            
            newStr += ch;
        }

        return newStr;
    }

    public static String decryptCaesarKey(String message, int key) {
        String newStr = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Lowercase letters
            if (ch >= 'a' && ch <= 'z') {
                ch -= 'a';
                ch += 26;
                ch -= (key % 26);
                ch %= 26;
                ch += 'a';
            }
            // Uppercase letters
            else if (ch >= 'A' && ch <= 'Z') {
                ch -= 'A';
                ch += 26;
                ch -= (key % 26);
                ch %= 26;
                ch += 'A';
            }
            
            newStr += ch;
        }

        return newStr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown message; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
