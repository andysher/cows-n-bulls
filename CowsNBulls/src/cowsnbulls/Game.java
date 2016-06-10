/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class Game {
    private final Player player;
    private final Round rounds;
    
    public Game(Player player) {
        this.player = player;
        this.rounds = new Round();
    }
    
    public void start()
    {
        //game logic
        
        System.out.println("\nWelcome and good luck " + player.getName().toUpperCase() + "....!!");
        //use rounds to play
        this.rounds.nextRound();
        System.out.print("Enter your Guess: "); 
        this.rounds.checkNumber(this.player.guessNumber());
        System.out.println(this.rounds.displayResult());
    }
    
    public void end()
    {
        System.out.println();
    }
}
