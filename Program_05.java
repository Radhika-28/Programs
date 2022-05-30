/*5.Write a program to accept the lower bound number and the upper bound number from the user and print the prime numbers between them.
Expected output:
Enter the lower bound value:
5
Enter the upper bound value:
15
The prime numbers between 5 and 15 are: 5 7 11 13
*/

import java.util.Scanner;

public class Program_05 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LB : ");
        int a=sc.nextInt();
        System.out.println("Enter UB : ");
        int b=sc.nextInt();
        
        int i,j,flag;
        for( i=a; i<=b; i++){
            if(i==1 || i==0)
                continue;
            flag=1;
            for( j=2; j<=i/2; ++j){
                if(i%j == 0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                    System.out.println(i+"");
            }
           
            
            
        }
    }
}
