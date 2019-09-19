import java.util.Scanner;
public class Problem1 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the Exchange Rate: ");
        float exchange =in.nextFloat();


        System.out.print("Enter amount: ");

        float amount = in.nextFloat();

        while(amount>0)
        {


            float result = amount*exchange;

            System.out.println("The Result is " + result);
            System.out.print("Enter amount: ");
            amount = in.nextFloat();

        }


    }
}
