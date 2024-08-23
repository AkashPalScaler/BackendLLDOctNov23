package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.models.PlayerType;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void display(Game game){
        System.out.println("The board view:");
        game.displayBoard();
    }

    public void makeMove(Game game){
        //parsing http req
        game.makeMove();
        //creating http response
    }
}
