/*3.Write a program to accept a number from the user and count the number of digits in the number*/

import java.util.Scanner;

public class Program_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n%10;
            ++count;
        }
        System.out.println("Count of digit is : "+ count);
    }
}
