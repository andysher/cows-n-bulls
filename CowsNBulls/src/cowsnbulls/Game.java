/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowsnbulls;

/**
 *
 * @author Andy
 */
public class Game {
    private final Player player;

    public Game(Player player) {
        this.player = player;
    }
    
    public void start()
    {
        //game logic
        System.out.println("\nWelcome and good luck " + player.getName().toUpperCase() + "!!");
        //use rounds to play
    }
    
    public void end()
    {
        System.out.println();
    }
}
