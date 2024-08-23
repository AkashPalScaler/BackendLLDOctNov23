package TicTacToe.strategies;

import TicTacToe.models.Cell;
import TicTacToe.models.Game;

public interface BotPlayingStrategy {
    public Cell makeMove(Game game);
}
