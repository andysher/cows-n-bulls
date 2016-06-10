/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls;

import cowsnbulls.Utilities.GameFilter;
import cowsnbulls.Utilities.Generator;

/**
 *
 * @author Andy
 */
public class CreateNumber {
    private int newNum;
    private Generator genObj = new Generator();
    private GameFilter filterObj = new GameFilter();
    
    public int newRound(){
        while(true)
        {
            //randomly genarate new number
            newNum = genObj.getGeneratedNum();
            //filter with game specification
            if(filterObj.isValid(newNum))
                return newNum;     
        }
    }
}
