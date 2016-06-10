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
public class GmNumber {
    private int d1;
    private int d2;
    private int d3;

    public GmNumber(int d1, int d2, int d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }

    public int getD3() {
        return d3;
    }

    @Override
    public String toString() {
        return "{" + d1 + d2 + d3 + "}";
    }
    
}
