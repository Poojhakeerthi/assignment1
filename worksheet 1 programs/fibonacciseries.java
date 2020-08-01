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
public class fibonacciseries {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=1;
        int b=1;
        int c=0,n;
        System.out.println("enter no. of values to be displayed");
        n=obj.nextInt();
        System.out.println("FIBONACCI SERIES\n");
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
    }
    
}
