package TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner sc = new Scanner(System.in);

    public HumanPlayer(String id, String name, Character symbol) {
        super(id, name, symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println(this.name + "'s move. Please make your move.");
        // We'll be waiting for player input
        System.out.println("Enter row: ");
        int r = sc.nextInt();

        System.out.println("Enter column:");
        int c = sc.nextInt();

        //create the move - cell, player
        Cell cell = new Cell(r, c);
        return new Move(cell, this);
    }
}
