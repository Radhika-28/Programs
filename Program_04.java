/*4.Write a program to generate following patterns
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
public class Program_04 {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }System.out.println();
            
        }
        
        
    }
    }


