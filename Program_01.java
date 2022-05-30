/*1.Write a program to accept a five digit number from the user, increment each digit by one and display the number (digit 9 gets incremented to 0).

Example:
Input: 14385
Output: 25496
*/
import java.util.Scanner;

public class  Program_01 {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit=0,rev=0;
        int arr[]={};int i=1;
        while(n>0){
            lastdigit=n%10;
            lastdigit+=1;
            n/=10;
            rev = rev*10+lastdigit%10;
        }
        System.out.println(lastdigit);
        int num=0;
        while(rev>0){
            num=num*10+rev%10;
            rev/=10;
        }
        System.out.println(num);
        
        
        
    }
}
