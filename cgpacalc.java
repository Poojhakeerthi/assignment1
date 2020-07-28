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
public class cgpacalc {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        double m[]=new double[10];
        double c[]=new double[10];
        double sum=0,csum=0;
        System.out.println("enter the no. of subjects");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter grade and credit for "+(i+1)+" subjects");
            m[i]=obj.nextDouble();
            c[i]=obj.nextDouble();
            sum=sum+m[i]*c[i];
            csum=csum+c[i];
        }
       System.out.println("cgpa= "+(sum/csum));
    }
}
