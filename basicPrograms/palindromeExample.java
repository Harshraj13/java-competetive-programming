package basicPrograms;
import java.util.Scanner;

public class palindromeExample {
    
    protected void palindromeChecker(int number){
        int temp = number, sum=0 , remainder;
        
        while(number>0){
            remainder = number%10;
            sum = (sum*10) + remainder;
            number = number/10;

        }
        if (temp ==sum)
            System.out.println(temp+" The number is palindrome");
        else
            System.out.println(temp+ " The number is not palindrome");
    }

    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        palindromeExample pe = new palindromeExample();
        pe.palindromeChecker(number);
        sc.close();
    }
}
