
package sellar;

import java.util.Scanner;


public class Sellar {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);    
           boolean exit=true;
           
         do {
            System.out.println("\n---------------PAYSLIP MANAGEMENT SYSTEM---------------");
            System.out.println("1. EMPLOYEE:");
            System.out.println("2. GENERATOR PAYSLIP:");
            System.out.println("3. PAYSLIP:");
            System.out.println("4. VIEW REPORT:");
           System.out.println("6. EXIT:");
           
           System.out.println("\n-------------------------------------------------------");
           
            System.out.print("Enter Action:");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                        Employee em = new Employee();
                        em.employeeInfo();
                    break;
                case 2:
                      
                 break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    System.out.println("Exit Selected...type 'yes' to continue:");
                    String resp = sc.next();
                    if(resp.equalsIgnoreCase("yes")){
                       
                    }
                    break;
            }
        } while(exit);
     
    }
    
}
