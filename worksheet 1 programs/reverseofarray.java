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
public class reverseofarray {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=obj.nextInt();
        int a[]=new int[10];
        int i;
        System.out.println("enter elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("reversed array:\n");
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
