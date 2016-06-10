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
    private GmNumber gn;
    
    public boolean isValid(int num)
    {
        separateDigits(num);
        if(!digitRepeated() && !zeroOccured())
            return true;
        return false;
    }
    
    private boolean digitRepeated()
    {
        if(gn.getD1()==gn.getD2() || gn.getD2()==gn.getD3() || gn.getD3()==gn.getD1())
            return true;
        return false;
    }
    
    private boolean zeroOccured()
    {
        if(gn.getD1()==0 || gn.getD2()==0 || gn.getD3()==0)
            return true;
        return false;
    }
    
    private void separateDigits(int num)
    {
        int d3 = num%10;
        num = num/10;
        int d2 = num%10;
        num = num/10;
        int d1 = num%10;
        gn = new GmNumber(d1,d2,d3);
    }

    public GmNumber getGn() {
        return gn;
    }
}
