package TicTacToe.models;

import TicTacToe.factories.BotPlayingStrategyFactory;
import TicTacToe.strategies.BotPlayingStrategy;

public class BotPlayer extends Player{
    private BotPlayingDifficulty botPlayingDifficulty;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String ID, String name, Character symbol, BotPlayingDifficulty botPlayingDifficulty) {
        super(ID, name, symbol, PlayerType.BOT);
        this.botPlayingDifficulty = botPlayingDifficulty;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botPlayingDifficulty);
    }

    @Override
    public void makeMove() {
        System.out.println(this.name + "'s move. Bot player move calculating.");
        // We write the code to make the next move - Cell/Move - Call a botPlayingStrategy
    }
}
