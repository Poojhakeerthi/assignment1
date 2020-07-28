/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgrm1;

/**
 *
 * @author POOJHA KEERTHI
 */
public class powerofnumber {
    public static void main(String[] args){
        int b = 3,p=6,sum=1,i;
        for(i=0;i<p;i++)
        {
         sum = sum*b;   
        }
        System.out.println("power of"+b+"^"+p+" is "+sum);
        
    }
    
}
