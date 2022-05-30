/*6.Given the list of N names, print it based on the alphabetical order of the first letter. If the first
letter of the two names is the same, print it in the order in the array.
Eg,
If the Names are Alice, Noah, Bob. Print it as Alice, Bob, Noah.
If the Names are Alice, Bob, Noah, Adam. Print it as Alice, Adam, Bob, Noah
If the Names are Bob, Alice, Adam, Ava. Print it as Alice, Adam, Ava, Bob.

Input Format
First-line will be N. Then N lines will have names.
Output Format
Names in sorted order

Sample Input 1:
4
Alice
Bob
Noah
Adam

Sample Output 1:
Alice
Adam
Bob
Noah
*/

import java.util.Scanner;

public class Program_06 {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n =sc.nextInt();
        String str[]=new String[n];
        System.out.println("Enter Strings : ");
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        String temp;
        for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if(str[i].compareTo(str[j])>0){
                   temp=str[i];
                   str[i]=str[j];
                   str[j]=temp;
               }
           }
        }
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }
    }
}
