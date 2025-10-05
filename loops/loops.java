package loops;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5
        // A: System.out.println(1);
        //    System.out.println(2);
        //    System.out.println(3);
        //    System.out.println(4);
        //    System.out.println(5);


        /* Q: Print numbers from 1 to 5
         for (int i = 1; i <= 5; i++) {
             System.out.println(i);
     }*/
        
        // Q: Print numbers from 1 to n
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 0; num <= n; num++) {
            System.out.print(num);
        }*/


        //While loop
        /*
          while (condition) {
              // body
          }
         */
        /*int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num+=1;
        }*/

        // Do while loop
        /*do {
            // body
        } while (condition);*/

        int n=1;
        do {
            System.out.println(n);
            n++;
        } while (n<=5);
        

    }
}
