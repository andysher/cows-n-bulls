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
public class Round {
    private int newNum;
    private final Generator genObj = new Generator();
    private final GameFilter filterObj = new GameFilter();
    
    public GmNumber newRound(){
        while(true)
        {
            //randomly genarate new number
            newNum = genObj.getGeneratedNum();
            //filter with game specification
            if(filterObj.isValid(newNum))
                return filterObj.getGn();     
        }
    }
}
