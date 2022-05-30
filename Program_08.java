/*8.Write a C program to remove 3 or more consecutive characters from a string, repeat 
until there are no more 
Ex: MNHHHHNNM => MNNNM => MM

*/
public class Program_08 {
    public static void removedup(String text){
        int n=text.length();
        if(n==0){ return; }
        String result="";
        int i=0;
        int k=0;
        while(i<n){
            while(k+i<n && text.charAt(k+i)==text.charAt(i)){
                k++;
            }
            if(k>=3){
                i+=k;
            }
            else{
                result=result+text.charAt(i);
                i++;
            }
            k=0;
        }
        System.out.println("Given text : "+text);
        System.out.println("Result : "+result);
    }
    public static void main(String args[]) {
        Program_08 rem = new Program_08();
        rem.removedup("aabbbcccd");
        
    }
}
