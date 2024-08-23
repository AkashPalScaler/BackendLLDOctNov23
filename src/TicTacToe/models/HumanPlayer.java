package TicTacToe.models;

public class HumanPlayer extends Player{

    public HumanPlayer(String id, String name, Character symbol) {
        super(id, name, symbol, PlayerType.HUMAN);
    }

    @Override
    public void makeMove() {
        System.out.println(this.name + "'s move. Please make your move.");
        // We'll be waiting for player input
    }
}
