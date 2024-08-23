package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.ColumnWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        try{
            //Homework: get these players from playerController
            Player player1 = new HumanPlayer("12", "Akash", 'X');
            Player player2 = new BotPlayer("13", "Botty", 'O', BotPlayingDifficulty.EASY);

            List<Player> players = new ArrayList<>();
            players.add(player1);
            players.add(player2);

            List<WinningStrategy> winningStrategies = new ArrayList<>();
            winningStrategies.add(new RowWinningStrategy());
            winningStrategies.add(new ColumnWinningStrategy());

            //Consider this game object as game id
            Game game = gameController.startGame(3, players, winningStrategies); // dimension,list of players, winningStrategy
            while(gameController.checkGameState(game).equals(GameState.IN_PROGRESS)){

                gameController.display(game);
                gameController.makeMove(game);

                if(gameController.checkGameState(game).equals(GameState.GAME_WON)){
                    System.out.println(gameController.getWinner(game) + " wins the game!");
                    break;
                }else if(gameController.checkGameState(game).equals(GameState.DRAW)){
                    System.out.println("Game is draw!");
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
