/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class Player {

    private String name;
    private ArrayList<GmNumber> pNumList;

    public Player(String name) {
        this.name = name;
        this.pNumList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public GmNumber guessNumber() {
        while (true) {
            System.out.print("Enter your Guess: ");
            Scanner input = new Scanner(System.in);
            GmNumber obj = Round.separateDigits(input.nextInt());
            if (obj.getD1() != 0 && obj.getD2() != 0 && obj.getD3() != 0) {
                if (obj.getD1() != obj.getD2() && obj.getD2() != obj.getD3()
                        & obj.getD1() != obj.getD3()) {
                    pNumList.add(obj);
                    return obj;
                }
            }
            System.out.println("INCORRECT INPUT..\n"
                    + "(Hint: use unique digits number and no '0')\n"
                    + "Try Again....!!!\n");
        }
    }

    public int getTotalTurns() {
        return this.pNumList.size();
    }

}
