public class Main {
    public static void main(String[] args) {

        int birthMonth = (11);
        System.out.println("What is your birth month [1-12]:");

        if (birthMonth>= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("Error, please enter a valid birth month: ");
        }

    }
}