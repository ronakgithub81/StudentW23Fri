
package studentw23fri;

import java.util.Scanner;

/**
 *
 * @author Ronak
 */
public class ReverseWord {
    public static void main(String[] args){
        System.out.println("Eneter word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] myLetters=new char[word.length()];
        
        for(int i=0;i<myLetters.length;i++){
            myLetters[i]=word.charAt(i);
            System.out.print(myLetters[i]);
        }//end of for
        System.out.println();
        System.out.println("printing in reverse");
         
        for(int i =myLetters.length-1;i>=0;i--) {
            System.out.print(myLetters[i]);
        }//end of reverse for loop         
        
    }//end of main    
}//end of class
