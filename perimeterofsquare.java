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
public class perimeterofsquare {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the side of the square");
        int a=obj.nextInt();
        System.out.println("perimeter of square is"+(4*a));
    }
    
}
