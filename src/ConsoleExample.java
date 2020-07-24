import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        String string;

        Console console = System.console();
        if(console == null){
            System.out.println("No console available");
            return;
        }
        System.out.println("Enter pass word");
        char[] password = console.readPassword();

        if(String.valueOf(password).equalsIgnoreCase("abc")){
            System.out.println("Correct Password");
        }

    }
}
