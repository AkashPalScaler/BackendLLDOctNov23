package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.ColumnWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner sc = new Scanner(System.in);

        try{
            //Homework: get these players from playerController
            Player player1 = new HumanPlayer("12", "Akash", 'X');
            Player player2 = new BotPlayer("13", "Botty", 'O', BotPlayingDifficulty.EASY);
            Player player3 = new HumanPlayer("14", "Amir", 'Y');

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

                if(gameController.getCurrentPlayer(game).getPlayerType().equals(PlayerType.HUMAN)){
                    gameController.display(game);
                    System.out.println("Do you want to undo? Press 1 to confirm and 2 to continue.");
                    int undo = sc.nextInt();

                    if(undo == 1){
                        gameController.undo(game);
                        continue;
                    }
                }


                if(gameController.checkGameState(game).equals(GameState.GAME_WON)){
                    System.out.println(gameController.getWinner(game).getName() + " wins the game!");
                    gameController.display(game);
                    break;
                }else if(gameController.checkGameState(game).equals(GameState.DRAW)){
                    System.out.println("Game is draw!");
                    gameController.display(game);
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}


//Adding more feature
// Unlimited undo
// Ds-Algo - write smart bot playing strategy
// REST Server API - Have a front end
// replaying steps