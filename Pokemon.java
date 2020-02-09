/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author asus
 */
public class Pokemon {
    
    private int blood;
    private int exp;
    String name ;
    public Pokemon(){
        blood=100;
        exp=0;
        
    }
    
    //Set name charecter
    public String setName(){
        System.out.println("I AM PIKACHU ");
        
         return "" ;
    }    

    //Show status charecter
    public String showStatus(){
        System.out.println("STATUS POINT");
        System.out.println("Pokemon Trainer : "+name );
        System.out.println("BLOOD : "+blood+"  Point");
        System.out.println("EXP : "+exp+"  Point");
        
        return "";
    }

   public String startGame(){
     int i;
     for(i=0;i<15;i++ ){
       if(i == 2){
         exp += 6;
         System.out.println(" exp is :"+exp);

       }
       else if(exp >= 18){
         blood -= 15;
         exp = 0;
         System.out.println(" exp is :"+exp);
         System.out.println(" blood is :"+blood);
       }
       else if(i == 14){
         i = 0;
       }
       else if(blood <= 0){
         System.out.println("!!! GAME OVER !!!");
         System.out.println("!!! SEE YOU !!!");
         break;    
       }
     }
     return "";
   }
}  

