package br.edu.uniaeso;

import br.edu.uniaeso.boards.BasicBoard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BasicBoard bb = new BasicBoard();
        bb.initBoard();
        System.out.println(bb.toString());
    }
}
