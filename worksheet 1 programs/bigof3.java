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
public class bigof3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c)
            System.out.println("A is greatest..."+a);
        else if(b>a && b>c)
            System.out.println("B is greatest..."+b);
        else
            System.out.println("C is greatest..."+c);
    }
            
            
    
}
