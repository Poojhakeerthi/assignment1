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
public class posnegzer {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter total number of values");
        n=obj.nextInt();
        int i,c,pos=0,neg=0,zer=0;
        System.out.println("enter the values");
        for(i=0;i<n;i++)
        {
            c=obj.nextInt();
            if(c>0)
                pos++;
            else if(c<0)
                neg++;
            else
                zer++;
        }
        System.out.println("no. of postive values...."+pos+"\nno.of negative values...."+neg+"\nno. of zeros...."+zer);
    }
}
