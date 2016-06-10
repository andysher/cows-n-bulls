/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls.Utilities;

import java.util.Random;

/**
 *
 * @author Andy
 */
public class Generator{
    private int genNum;
    
    public int getGeneratedNum(){
        generateRandNum();
        return genNum;
    }
    
    private void generateRandNum(){
        //code to generate random number between 123 and 987
        Random rd = new Random();
      
        while(true)
        {
            int newNumber = rd.nextInt(1000);
            //System.out.println(newNumber);
            if(newNumber > 123 && newNumber < 987)
            {
                //System.out.println(newNumber);
                genNum = newNumber;
                break;
            }
        }
    }
}
