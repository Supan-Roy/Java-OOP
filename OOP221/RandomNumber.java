package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();
        
        for(int i=0;i<5;i++){
            int ranNum = 100+random.nextInt(101);
            System.out.println(ranNum);
        }
    }
}