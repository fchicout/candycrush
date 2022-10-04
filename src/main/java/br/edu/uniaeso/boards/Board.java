package br.edu.uniaeso.boards;

import br.edu.uniaeso.pieces.CandyPiece;

public abstract class Board {
    private int xDim;
    private int yDim;
    private int limitBlue, limitPurple, limitGreen, limitOrange;
    private CandyPiece candyBoard[][];

    public abstract void initBoard();

    public int getxDim() {
        return xDim;
    }

    public void setxDim(int xDim) {
        this.xDim = xDim;
    }

    public int getyDim() {
        return yDim;
    }

    public void setyDim(int yDim) {
        this.yDim = yDim;
    }

    public CandyPiece[][] getCandyBoard() {
        return candyBoard;
    }

    public void setCandyBoard(CandyPiece[][] candyBoard) {
        this.candyBoard = candyBoard;
    }

    public int getLimitBlue() {
        return limitBlue;
    }

    public void setLimitBlue(int limitBlue) {
        this.limitBlue = limitBlue;
    }

    public int getLimitPurple() {
        return limitPurple;
    }

    public void setLimitPurple(int limitPurple) {
        this.limitPurple = limitPurple;
    }

    public int getLimitGreen() {
        return limitGreen;
    }

    public void setLimitGreen(int limitGreen) {
        this.limitGreen = limitGreen;
    }

    public int getLimitOrange() {
        return limitOrange;
    }

    public void setLimitOrange(int limitOrange) {
        this.limitOrange = limitOrange;
    }
    
    @Override
    public String toString(){
        String text = "";
        for (int i = 0; i < candyBoard.length; i++) {
            text+="\n";
            for (int j = 0; j < candyBoard[i].length; j++) {
                text += (candyBoard[i][j] + "\t");
            }
        }
        return text;
    }
}
