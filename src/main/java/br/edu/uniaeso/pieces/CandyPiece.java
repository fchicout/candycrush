package br.edu.uniaeso.pieces;

public class CandyPiece {
    private String candyType;
    private int score;
    private boolean isMoveable;

    CandyPiece() {
        super();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isMoveable() {
        return isMoveable;
    }

    public void setMoveable(boolean isMoveable) {
        this.isMoveable = isMoveable;
    }

    public String getCandyType() {
        return candyType;
    }

    public void setCandyType(String candyType) {
        this.candyType = candyType;
    }

    @Override
    public String toString() {
        return getCandyType();
    }
}
