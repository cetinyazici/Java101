package minesweeper;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mayın Tarkası Oyunu");
        MineSweeper game = new MineSweeper(3, 3); 
        game.oyna();
    }
    
}
