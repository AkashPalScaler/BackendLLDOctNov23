package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> grid;

    public Board(int dimension){
        this.dimension = dimension;
        grid = new ArrayList<>(); //[]
        for(int i=0;i<dimension;i++){
            grid.add(new ArrayList<>()); // [[]] -> [[cell1, cell2, cell3],[]] ->[[cell1, cell2, cell3],[cell4, cell5, cell6], []]
            for(int j=0;j<dimension;j++){
                grid.get(i).add(new Cell(i, j)); //[[cell1, cell2, cell3]]-> [[cell1, cell2, cell3] , [cell4, cell5, cell6]]
            }
        }
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void display(){
        //Display the board
        for(List<Cell> row : grid){
            for(Cell cell: row){
                cell.display();
            }
            System.out.println();
        }
    }
}
