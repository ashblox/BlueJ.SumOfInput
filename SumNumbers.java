
/**
 * Sums numbers from 1 throug input 'n'
 *
 * @author ashblox
 * @version 1.0
 */

import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you chose?");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum of numbers 1 through " + num + " is " 
        + sum + ".");
    }
}
