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
public class sumofnum {
    public static void main(String[] args){
     int n,sum=0,i;
     Scanner obj=new Scanner(System.in);
     System.out.println("enter the number of values");
     n=obj.nextInt();
     System.out.println("the values are");
     for(i=0;i<n;i++)
     {
         sum=sum + obj.nextInt();
         
     }
     System.out.println("the sum is "+sum);
    }
}
