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
public class productdiscount {
    public static void main(String[] args){
        int amount,percent;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount");
        double d=obj.nextDouble();
        System.out.println("enter discount percent");
        double d1=obj.nextDouble();
        double amtper=d/100*d1;
        System.out.println("final amount="+(d-amtper));
    }
    
}
