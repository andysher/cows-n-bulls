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
public class CowsNBulls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t******Cows & Bulls******\n");
        System.out.print("Enter player name: ");
        Player plyr = new Player(input.next());
        Game cnb = new Game(plyr);
        cnb.start();
        cnb.end();
    }
    
}
