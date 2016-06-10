/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls.Utilities;

import cowsnbulls.GmNumber;

/**
 *
 * @author Andy
 */
public class GameFilter{
    private GmNumber genNum;
    
    public boolean isValid(GmNumber genNum)
    {
//        separateDigits(num);
        this.genNum = genNum;
        if(!digitRepeated() && !zeroOccured())
            return true;
        return false;
    }
    
    private boolean digitRepeated()
    {
        if(genNum.getD1()==genNum.getD2() || genNum.getD2()==genNum.getD3() || genNum.getD3()==genNum.getD1())
            return true;
        return false;
    }
    
    private boolean zeroOccured()
    {
        if(genNum.getD1()==0 || genNum.getD2()==0 || genNum.getD3()==0)
            return true;
        return false;
    }

    public GmNumber getGenNum() {
        return genNum;
    }
}
