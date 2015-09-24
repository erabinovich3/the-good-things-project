import java.util.Scanner;

public class GoodThings {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("The Good Things Project");
        System.out.println("For a little Pick-Me-Up");
        while (true) {
            Compliment c = new Compliment();
            System.out.println(c.getCompliment() + "\n");
            System.out.println("Enter 999 to recieve another pick-me-up. 000 to stop.");
            String choice = input.nextLine();
            if (choice.equals("000")) {
                System.out.println("\nHave a nice day!");
                System.exit(0);
            } else if (!choice.equals("999")) {
                System.out.println("\nThat wasn't an option! But we forgive you."
                    + " Here's another pick-me-up anyway:");
            }
        }
    }
}