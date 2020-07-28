/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgrm1;
import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class calcusingswitchcase {
    public static void main(String[] args){
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 2 values");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("enter the symbol of the operation to be performed");
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*': 
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid choice");
        } 
    }
}
