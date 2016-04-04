/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sc;
import java.util.Scanner;
import com.leapfrog.sc.util.Calculator;

/**
 *
 * @author Admin
 */
public class Program {
/**
     * @param args the command line arguments
     */
    
    public static void menu(){
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Power");
        System.out.println("Enter your choice[1-5]:");
    }
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        while(true){
        System.out.println("Enter first Number:");
        int x=input.nextInt();
        System.out.println("Enter second number:");
        int y=input.nextInt();
        
        menu();
        
        int choice=input.nextInt();
        int total=process(choice,x,y);
        
        
        System.out.println("output is "+ total);
            System.out.println("Do you want to calculate more [Y/N]");
            
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
        
    }
    
    
    private static int process(int choice,int x, int y){
        int total=0;
        Calculator c=new Calculator();
        switch(choice){
            case 1:
                total=c.add(x, y);
                break;
            case 2:
                total=c.sub(x, y);
                break;
            case 3:
                total =c.mul(x, y);
                break;
            case 4:
                total=c.div(x, y);
                break;
            case 5:
                total=c.power(x, y);
                break;                
            default:
                System.out.println("Invalid Choice");
                break;
        }   
        return total;
    }
    
}
