import java.util.Scanner;
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Provide Input: ");
        String input = in.nextLine();
        
        Context upper = new Context(new UppercaseFormatter());
        Context lower = new Context(new LowercaseFormatter());
        Context title = new Context(new TitlecaseFormatter());
        
        System.out.println("----------------------------------------");
        System.out.println("Your Input: " + input);
        System.out.println("----------------------------------------");
        System.out.println("Your Input in Uppercase: " + upper.executeStrategy(input));
        System.out.println("----------------------------------------");
        System.out.println("Your Input in Lowercase: " + lower.executeStrategy(input));
        System.out.println("----------------------------------------");
        System.out.println("Your Input Title Case: " + title.executeStrategy(input));
        System.out.println("----------------------------------------");
    }
}