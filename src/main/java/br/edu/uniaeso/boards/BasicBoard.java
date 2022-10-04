package br.edu.uniaeso.boards;

import java.util.Random;

import br.edu.uniaeso.pieces.BlueCandy;
import br.edu.uniaeso.pieces.CandyPiece;
import br.edu.uniaeso.pieces.GreenCandy;
import br.edu.uniaeso.pieces.OrangeCandy;
import br.edu.uniaeso.pieces.PurpleCandy;

public class BasicBoard extends Board {

    @Override
    public void initBoard() {
        // TODO Auto-generated method stub
        // Sem áreas mortas
        setxDim(5);
        setyDim(6);
        setCandyBoard(new CandyPiece[getxDim()][getyDim()]);
        // 8 Azuis, 7 Verdes, 8 Roxas, 7 Laranjas
        setLimitBlue(8);
        setLimitGreen(7);
        setLimitPurple(8);
        setLimitOrange(7);
        int contAzul = 0, contVerde = 0, contRoxa = 0, contLaranja = 0;
        CandyPiece piece = null;

        for (int i = 0; i < getxDim(); i++) {
            for (int j = 0; j < getyDim();) {
                piece = sortCandy();
                if (piece instanceof BlueCandy) {
                    if (contAzul < getLimitBlue()) {
                        getCandyBoard()[i][j] = piece;
                        contAzul++;
                        j++;
                    }
                } else if (piece instanceof GreenCandy) {
                    if (contVerde < getLimitGreen()) {
                        getCandyBoard()[i][j] = piece;
                        contVerde++;
                        j++;
                    }
                } else if (piece instanceof PurpleCandy) {
                    if (contRoxa < getLimitPurple()) {
                        getCandyBoard()[i][j] = piece;
                        contRoxa++;
                        j++;
                    }
                } else if (piece instanceof OrangeCandy) {
                    if (contLaranja < getLimitOrange()) {
                        getCandyBoard()[i][j] = piece;
                        contLaranja++;
                        j++;
                    }
                }
            }
        }
    }

    public CandyPiece sortCandy() {
        int rNumber = (new Random()).nextInt(4) + 1;

        switch (rNumber) {
            case 1:
                return new BlueCandy();
            case 2:
                return new GreenCandy();
            case 3:
                return new OrangeCandy();
            case 4:
                return new PurpleCandy();
        }
        return null;
    }

}
