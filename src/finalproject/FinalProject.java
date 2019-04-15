
package finalproject;

import java.util.Scanner;

/**
 *
 * @author Rodny German
 */


public class FinalProject {
    
int binary;
int decimal;
    
    
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        FinalProject obj = new FinalProject();
       
        Scanner user_input = new Scanner(System.in);
       
        int select_main = 0;
        int select_converter = 0;
        int select_calculator = 0;
        int select_inCalculator = 0;
        
        String binary;
        int decimal = 0;
        
        while (select_main != 4){
            
            System.out.println("Welcome to B-D Converter");
            System.out.println("      Menu:");
            System.out.println("1. Conversion menu.");
            System.out.println("2. Calculator menu.");
            System.out.println("3. Program info.");
            System.out.println("4. Exit program.");
        
        select_main = user_input.nextInt();
  
       
        
            
        if (select_main == 1){
            while (select_converter != 3){
                
            System.out.println("Converter Menu");
            System.out.println("1. Binary to Decimal.");
            System.out.println("2. Decimal to Binary.");
            System.out.println("3. Return to Main menu.");
            
             select_converter = user_input.nextInt();
            }
            if (select_converter ==  1){
                int bsc = 0;
                while ( bsc != 2){
              System.out.println("Enter a binary number: ");
              binary = user_input.next();
              System.out.println(binary +" "+ "converts to" +" "+Integer.parseInt(binary,2));
                System.out.println("Enter 1 to try again or 2 to exit");
                bsc = user_input.nextInt();
                }
                
            }
            if (select_converter ==  2){
                int dsc  = 0;
                while ( dsc != 2){
              System.out.println("Enter a decimal number: ");
              decimal = user_input.nextInt();
              System.out.println(decimal+" "+"converts to"+" "+Integer.toBinaryString(decimal));
                System.out.println("Enter 1 to try again or 2 to exit");
                dsc = user_input.nextInt();
            }
            }
            }
        
       if (select_main == 2){
            
            while(select_calculator != 4){
             System.out.println("Calculator Menu");
             System.out.println("1. Binary - Binary");
             System.out.println("4. Return to Main menu.");
             
             select_calculator = user_input.nextInt();
            
            
              if (select_calculator == 1){
                  
                  while (select_inCalculator != 3){
                  System.out.println(" ");
                  System.out.println("1. Add");
                  System.out.println("2. Subtraction");
                  System.out.println("3. Return.");
                  
                  select_inCalculator = user_input.nextInt();
    
                  if (select_inCalculator == 1){
                      
                      String firstnum = null, secondnum = null;
                      //int firstnumdig, secondnumdig, sumdig;
                      int exit = 0;
   
                      while (exit != 2) {
                      System.out.println("Enter first binary number");
                      firstnum = user_input.next();
                      System.out.println("Enter second binary number");
                      secondnum = user_input.next();
                      
                      int firstnumdig = Integer.parseInt(firstnum,2);
                      int secondnumdig = Integer.parseInt(secondnum,2);
                      int sumdig = firstnumdig + secondnumdig;
                      System.out.println("The sum between"+" "+firstnum+" "+"and"+" "+secondnum+" "+"is"+" "+ Integer.toBinaryString(sumdig));
                      System.out.println("Enter 1 to try again or 2 to exit");
                      exit = user_input.nextInt();
                      }
                  }  
                  if (select_inCalculator == 2){
                      int exit = 0;
   
                      while (exit != 2) {
                          String firstnum = null, secondnum = null;
                      
                      System.out.println("Enter first binary number");
                      firstnum = user_input.next();
                      System.out.println("Enter second binary number");
                      secondnum = user_input.next();
                      
                      int firstnumdig = Integer.parseInt(firstnum,2);
                      int secondnumdig = Integer.parseInt(secondnum,2);
                      int sumdig = firstnumdig - secondnumdig;
                      System.out.println("The difference between"+" "+firstnum+" "+"and"+" "+secondnum+" "+"is"+" "+ Integer.toBinaryString(sumdig));
                      System.out.println("Enter 1 to try again or 2 to exit");
                      exit = user_input.nextInt();
                  }
                  }
                  if (select_main == 3){
                      
                      System.out.println("This is a program that can convert a decimal number to a binary number and viceversa.");
                      System.out.println("It can also add binary numbers.");
                  }
    
            
              
              
              }}}}}}}
    
    

