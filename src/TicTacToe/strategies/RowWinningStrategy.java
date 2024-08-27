package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> rowCountMap;

    public RowWinningStrategy() {
        this.rowCountMap = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {

        int r = move.getCell().getRow();
        Character symbol = move.getPlayer().getSymbol();

        rowCountMap.putIfAbsent(r, new HashMap<>());
        HashMap<Character, Integer> countMap = rowCountMap.get(r);

        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        if(countMap.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move move) {
        int r = move.getCell().getRow();
        Character symbol = move.getPlayer().getSymbol();

        HashMap<Character, Integer> countMap = rowCountMap.get(r);
        countMap.put(symbol, countMap.get(symbol)-1);

    }
}
