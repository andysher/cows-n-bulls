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
    private GmNumber roundNum;
//    private String rsRound;
    private int cows;
    private int bulls;
    private final Generator generatorObj = new Generator();
    private final GameFilter filterObj = new GameFilter();
    
    public void nextRound(){
        this.cows = 0;
        this.bulls = 0;
        while(true)
        {
            //randomly genarate new number
            int newNum = this.generatorObj.getGeneratedNum();
            //filter with game specification
            if(this.filterObj.isValid(this.separateDigits(newNum))
            {
                this.roundNum = this.filterObj.getGenNum(); 
                System.out.println("\nNew number has been set: " + this.roundNum);
                break;
            }
            
        }
    }
    
    public void checkNumber(GmNumber userNum)
    {
        this.checkNumberForBulls(userNum.getD1(),userNum.getD2(),userNum.getD3());
        this.checkNumberForCows(userNum.getD1(),userNum.getD2(),userNum.getD3());
    }
    
    public String displayResult(){
        return "\nYou got:\n\t" + this.cows + " Cows and "
               + this.bulls + " Bulls.....!!";
    }
    
    private void checkNumberForBulls(int d1, int d2, int d3)
    {
        if(d1 == this.roundNum.getD1())
            this.bulls++;
        if(d2 == this.roundNum.getD2())
            this.bulls++;
        if(d3 == this.roundNum.getD3())
            this.bulls++;
    }
    
    private void checkNumberForCows(int d1, int d2, int d3)
    {
        if(d1 == this.roundNum.getD2() || d1 == this.roundNum.getD3())
            this.cows++;
        if(d2 == this.roundNum.getD1() || d2 == this.roundNum.getD3())
            this.cows++;
        if(d3 == this.roundNum.getD2() || d3 == this.roundNum.getD1())
            this.cows++;
    }
    
    private GmNumber separateDigits(int num)
    {
        int d3 = num%10;
        num = num/10;
        int d2 = num%10;
        num = num/10;
        int d1 = num%10;
        return new GmNumber(d1,d2,d3);
    }
}
