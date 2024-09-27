import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String partyAffiliation = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your political affiliation (D, R, I, or O): ");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}