import javax.naming.CannotProceedException;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String[] args) {
        int r,sum=0,temp;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        temp=n;
        while(n > 0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println( temp + " is a palindrome number ");
        else
            System.out.println(temp + " is not a palindrome number");
    }
}


