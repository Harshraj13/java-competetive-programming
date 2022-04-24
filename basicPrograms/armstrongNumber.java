package basicPrograms;
import java.util.Scanner;
import java.lang.Math;

public class armstrongNumber {
        // armstrong number is a number whose sum of cubes of its digits is equal to the number itself.
        // for example 153 is an armstrong number because 153 = 1^3 + 5^3 + 3^3.
        public static void main(String a[]) throws Exception{

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the limit: ");

            int num = scan.nextInt();
            System.out.println("Armstrong numbers up to "+num+" are: ");
            for(int i=0;i<num;i++){
                //function calling
                if(isArmstrongNumber(i)){
                    System.out.print(i+" , ");
                }

            }


        }

        // function to calculate armstrong number
        public static boolean isArmstrongNumber(int number){
            int temp, digits =0, last= 0, sum=0;

            temp = number;
            //loop executes until temp becomes false
            while(temp>0){
                temp = temp/10;
                //to get the power of the number i.e number of digits
                digits++;
                
            }
            temp = number;
            while(temp>0){
                //determine the last digit
                last = temp % 10;
                //calculate the sum of cubes of digits
                sum +=  (Math.pow(last, digits));
                //remove last digit
                temp = temp/10;

            }
            //compare the sum with n
            if(number==sum){
                return true;
            }
            else{
                return false;
            }
        }
}
