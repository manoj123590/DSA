package Conditions;

public class main {
    public static void main(String[] args) {
        /*
          Syntax of if condition
          if (condition) {
            // code to be executed if condition is true
          } else {
           // code to be executed if condition is false
          }
         */

         int salary = 25400;
            // if (salary > 10000) {
            //     salary += 2000;
            // } else {
            //     salary += 1000;
            // }

            // Multiple if-else if-else ladder

            if (salary > 10000) {
                salary += 2000;
            } else if (salary > 20000) {
                salary += 3000;
            } else {
                salary += 1000;
            }
            System.out.println(salary);
    }

}
