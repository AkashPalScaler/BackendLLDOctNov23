package TicTacToe.models;

import TicTacToe.exceptions.DimensionAndPlayerCountMismatch;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.strategies.WinningStrategy;
import TicTacToe.validations.gameValidations.DimensionAndPlayerCount;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void displayBoard(){
        board.display();
    }

    public void makeMove(){
        //make a move
        //Check the next player
        //Ask the player to make the move
        //CheckWinner
        //Store the move
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        int dimension;
        List<Player> players;
        List<WinningStrategy> winningStrategies;


        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validateConfigParams() throws InvalidPlayerCountException, DimensionAndPlayerCountMismatch {
            // Validate dimension and player count
            DimensionAndPlayerCount.validate(this.dimension, this.players);
            // Validating unique symbols - HashSet/Stream, distinct
            // Validate bot count - count number bots in playerlist, check if it is <= 1
        }

        public Game build() throws InvalidPlayerCountException, DimensionAndPlayerCountMismatch {
            // we will also validate `this` parameter
            // Homework - write three validations
            validateConfigParams();
            return new Game(this.dimension, this.players, this.winningStrategies);
        }
    }
}
