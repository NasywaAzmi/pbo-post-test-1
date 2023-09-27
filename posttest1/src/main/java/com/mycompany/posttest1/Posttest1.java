/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author Asus Gk
 */
class Game {
    
    public String title;
    public int gamesize;
    
    public Game(String title, int gamesize) {
        this.title = title;
        this.gamesize = gamesize;
    }
}

public class Posttest1 {
    public static void main(String[] args) {
        
        Game[] games = new Game[5];
        
        games[0] = new Game("Elden Ring", 60);
        games[1] = new Game("God Of War", 70);
        games[2] = new Game("Skyrim", 19);
        games[3] = new Game("Red Dead Redemption 2", 150);
        games[4] = new Game("Knack 2", 8);
        
        for (int i = 0; i < games.length; i++) {
            System.out.print("\n Games " + (i + 1) + ": " + games[i].title);
            System.out.print( " |Size " + ": " + games[i].gamesize + "gb");
        }
    }
}
