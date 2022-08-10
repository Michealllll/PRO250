package chess;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.swing.JPanel;
import java.awt.GridLayout;

import chess.Main;
import pieces.Piece;
import pieces.Rook;

import chess.Cell;

import org.junit.Test;

public class ChessTest {
    @Test
    public void testOldVariablesWork(){
        assertTrue(chess.Main.chance == 0);
    }

    @Test
	public void oldPiecesCreate(){
        Piece joe = new Rook("WR01","White_Rook.png",0);
		assertNotNull(joe);
	}

    @Test
    public void boardCreation(){
        JPanel jpanelTest = new JPanel(new GridLayout(8,8));
        assertNotNull(jpanelTest);
    }
    @Test
    public void testGenerateNewRow(){
        assertNotNull(chess.Main.generateFirstRow());
    }

    @Test
    public void testBoardState(){
        assertNotNull(new Cell[8][8]);
    }

}
