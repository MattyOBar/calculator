import java.util.Scanner;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt){
        return prompt;
    }
    private static double getDouble(String prompt){
        double promptDouble = Double.parseDouble(prompt);
        return promptDouble;
    }




    public static void main(String[] args){
        boolean rewind = true;
        double num1 = 0;
        double num2 = 0;
        while (rewind == true){
            System.out.println("Please enter your first number.");
            String prompt = inputScanner.next();
            num1 = getDouble(prompt);
            System.out.println("Please enter your second number.");
            prompt = inputScanner.next();
            num2 = getDouble(prompt);
            System.out.println("Addition: " + Calculator.add(num1, num2));
            System.out.println("Subraction: " + Calculator.subtract(num1, num2));
            System.out.println("Multiply: " + Calculator.multiply(num1, num2));
            System.out.println("Divide: " + Calculator.divide(num1, num2));
            System.out.println("Would you like to do more math? (true/false): ");
            rewind = inputScanner.nextBoolean();
        }
        System.out.println("Goodbye");
    }
}