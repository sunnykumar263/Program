import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no whose factorial to be find");
        int Num = sc.nextInt();
        int fact;
        while(Num != 0){
            fact = Num * (Num - 1);
            Num--;
        }
    }
}
