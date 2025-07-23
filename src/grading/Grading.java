package grading;

import java.util.Scanner;

public class Grading {

    
    public static void main(String[] args) {
        
        int total;
        float average;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name : ");
         String name = scan.nextLine();
         
        System.out.print("Enter marks in Science : ");
         int science = scan.nextInt();
         
        System.out.print("Enter marks in History : ");
         int history = scan.nextInt();
         
        System.out.print("Enter marks in Math : ");
         int math = scan.nextInt();
         
        System.out.print("Enter marks in Soc : ");
         int soc = scan.nextInt();
         
        System.out.print("Enter marks in Arts : ");
         int arts = scan.nextInt();
         
        total = science + history + math + soc + arts;
        average = (float) total / 5;
        
        System.out.println("\nTotal Marks : " + total );
        System.out.println("Total pecentage : " + average );
        
        if ( average >= 91 && average <= 100 ){
            
            System.out.println("Remarks : Excellent!");
            System.out.println("\nCongrats " + name + " You Passed.");
        }
        else if ( average >= 86 && average <= 90.9 ){
            
            System.out.println("Remarks : Very Good!");
            System.out.println("\nCongrats " + name + " You Passed.");
        }
        else if ( average >= 81 && average <= 85.9 ){
            
            System.out.println("Remarks : Good!");
            System.out.println("\nCongrats " + name + " You Passed.");
        }
        else if ( average >= 76 && average <= 80.9 ){
            
            System.out.println("Remarks : Fair!");
            System.out.println("\nCongrats " + name + " You Passed.");
        }
        else if ( average >= 71 && average <= 75.9 ){
            
            System.out.println("Remarks : Poor!");
            System.out.println("\nCongrats " + name + " You Passed.");
        }
        else{
            System.out.println("Remarks : Fail!");
            System.out.println("\nSorry " + name + " Try Again!");
        }
        
        
    }
    
}