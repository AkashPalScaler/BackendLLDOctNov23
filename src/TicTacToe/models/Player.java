package TicTacToe.models;

public abstract class Player {
    private String ID;
    protected String name;
    private Character symbol;
    private PlayerType playerType;

    public Player(String ID, String name, Character symbol, PlayerType playerType) {
        this.ID = ID;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public abstract void makeMove();
}
