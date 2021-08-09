import java.util.Scanner;

public class vowels
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    }
}

/* import java.util.*;  

class vowels{
   public static void main (Strings[] args){
     char input;
     System.out.println("Enter the alphabet/n");
   Scanner in = new Scanner(System.in);
       input = in.next().charAt(0);
     System.out.println(+input);
     if (input == a){
        System.out.println("its a vowel");
       } 
     else if (input == e){
        System.out.println("its a vowel");
       }
     else if (input == i){
         System.out.println("its a vowel");
       }
     else if (input == o){
         System.out.println("its a vowel");
       }
     else if (input == u){
         System.out.println("its a vowel");
      }
     else{
         System.out.println("its not a vowel");
      }
 
    } 
}
*/