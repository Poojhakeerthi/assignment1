/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class volumecalcinmainfunction {
    public static void main(String[] args){
        box obj1=new box();
        double h,w,d,vol;
        h=obj1.getheight();
        w=obj1.getwidth();
        d=obj1.getdepth();
        vol=h*w*d;
        System.out.println("volume = "+vol);
    }
}
class box
{
    double height,width,depth;
    Scanner obj=new Scanner(System.in);
    double getheight()
    {
      System.out.println("enter height :");
      height=obj.nextDouble();
      return height;
    }
    double getwidth()
    {
        System.out.println("enter width");
        width=obj.nextDouble();
        return width;
    }
    double getdepth()
    {
        System.out.println("enter depth");
        depth=obj.nextDouble();
        return depth;
    }
}