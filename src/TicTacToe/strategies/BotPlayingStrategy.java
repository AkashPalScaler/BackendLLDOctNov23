package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Game;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board);
}
