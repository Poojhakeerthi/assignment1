/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
class volumecalc
{
    double height,width,depth,vol;
    void volume()
    {
        vol=depth*height*width;
        System.out.println("volume = "+vol);
    }
}
/**
 *
 * @author POOJHA KEERTHI
 */
public class volumeclass {
    public static void main(String[] args){
        volumecalc obj1=new volumecalc();
        obj1.depth=1;
        obj1.height=6;
        obj1.width=4;
        obj1.volume();
        volumecalc obj2=new volumecalc();
        obj2.depth=5;
        obj2.height=7;
        obj2.width=2;
        obj2.volume();
    }
}
