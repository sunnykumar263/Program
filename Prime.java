import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no to be checked as prime");
        int Num = sc.nextInt();

        if(Num == 2){
            System.out.println(Num + " is a prime no");
        }
        else{
            for(int i=2; i<=Math.sqrt(Num); i++){
               if (Num % i == 0){
                  System.out.println(Num + " is not a prime no");
           }
           else{
               System.out.println(Num + " is a prime no");
           }
        }
        }
        sc.close();
    }
}
