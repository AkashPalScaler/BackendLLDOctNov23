package TicTacToe.models;

import TicTacToe.controllers.GameController;
import TicTacToe.exceptions.DimensionAndPlayerCountMismatch;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.strategies.WinningStrategy;
import TicTacToe.validations.gameValidations.DimensionAndPlayerCount;

import java.util.ArrayList;
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
        this.moves = new ArrayList<>();
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

    public boolean validateMove(Move move){
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();
        boolean flag = true;

        if(r < 0 || r > board.getDimension() - 1 || c < 0 || c > board.getDimension() - 1){
            System.out.println("Invalid Move, Please try again!");
            return false;
        }

        Cell cellToUpdate = board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol());
        move.setCell(cellToUpdate);


       if(!move.getCell().getCellState().equals(CellState.EMPTY)){
           System.out.println("Invalid Move, Please try again!");
           return false;
       }
       return true;
    }

    public void makeMove(){
        //make a move

        //Check the next player
        Player currentPlayer = players.get(nextPlayerIndex);

        Move move;
        //Validate the move
        do {
            //Ask the player to make the move
            move = currentPlayer.makeMove(board);
        }while(!validateMove(move));

        //Update the board/cell
        move.getCell().setCellState(CellState.FILLED);
        move.getCell().setPlayer(currentPlayer);

        //Store the move
        moves.add(move);

        //Check and set winner
        if(checkWinner(move)){
            setGameState(GameState.GAME_WON);
            setWinner(currentPlayer);
        }else if(moves.size() == board.getDimension() * board.getDimension()){
            setGameState(GameState.DRAW);
            setWinner(null);
        }

        //Update the next player
        nextPlayerIndex = (nextPlayerIndex + 1) % players.size();

    }

    private boolean checkWinner(Move move) {
        //Different strategies - any one of those strategies are fulfilled we have a winner
        for(WinningStrategy ws : winningStrategies){
            if(ws.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public Player getCurrentPlayer(){
        int index = ( nextPlayerIndex - 1 + players.size()) % players.size();
        return players.get(index);
    }

    public void undo(){
        //Remove move from move list
        if(moves.size() <= 0){
            System.out.println("No moves left to undo");
            return;
        }
        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(lastMove);

        //Revert update to board/cell
        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setPlayer(null);

        //Winning Strategy hashmaps
        for(WinningStrategy ws : winningStrategies){
            ws.handleUndo(lastMove);
        }
        //Update Gamestate and winner - in case it was a win/draw
        setGameState(GameState.IN_PROGRESS);
        setWinner(null);

        //update player - keep player as same from last move
        nextPlayerIndex--;
        nextPlayerIndex = ( nextPlayerIndex + players.size()) % players.size(); // (a - b)%m = (a - b + m)%m

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
