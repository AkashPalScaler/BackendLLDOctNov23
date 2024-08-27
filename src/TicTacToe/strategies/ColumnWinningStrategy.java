package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> colCountMap;

    public ColumnWinningStrategy() {
        this.colCountMap = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {

        int c = move.getCell().getCol();
        Character symbol = move.getPlayer().getSymbol();

        colCountMap.putIfAbsent(c, new HashMap<>());
        HashMap<Character, Integer> countMap = colCountMap.get(c);

        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        if(countMap.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move move) {
        int c = move.getCell().getCol();
        Character symbol = move.getPlayer().getSymbol();

        HashMap<Character, Integer> countMap = colCountMap.get(c);
        countMap.put(symbol, countMap.get(symbol)-1);

    }
}
