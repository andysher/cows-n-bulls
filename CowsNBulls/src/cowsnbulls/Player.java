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
    
    public GmNumber guessNumber()
    {
        Scanner input = new Scanner(System.in);
        GmNumber obj = Round.separateDigits(input.nextInt());
        pNumList.add(obj);
        return obj;
    }

}
