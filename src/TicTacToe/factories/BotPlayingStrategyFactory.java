package TicTacToe.factories;

import TicTacToe.models.BotPlayingDifficulty;
import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotPlayingDifficulty difficulty){
        if(difficulty.equals(BotPlayingDifficulty.EASY)){
            return new EasyBotPlayingStrategy();
        }
        //rest if and else
        return null;
    }
}
