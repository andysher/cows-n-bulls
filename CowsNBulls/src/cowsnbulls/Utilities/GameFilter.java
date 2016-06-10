/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls.Utilities;

/**
 *
 * @author Andy
 */
public class GameFilter{
    private int d1;
    private int d2;
    private int d3;
    
    public boolean isValid(int num)
    {
        separateDigits(num);
        if(!digitRepeated() && !zeroOccured())
            return true;
        return false;
    }
    
    private boolean digitRepeated()
    {
        if(d1==d2 || d2==d3 || d3==d1)
            return true;
        return false;
    }
    
    private boolean zeroOccured()
    {
        if(d1==0 || d2==0 || d3==0)
            return true;
        return false;
    }
    
    private void separateDigits(int num)
    {
        d3 = num%10;
        num = num/10;
        d2 = num%10;
        num = num/10;
        d1 = num%10;
    }
}
