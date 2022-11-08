package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    /**
     * The unit under test.
     */
    private Board board;

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testBoardValid() {
        // Remove the following placeholder:
        Square sq = new BasicSquare();
        Square[][] table = new Square[1][1];
        table[0][0] = sq;
        board = new Board(table);
        assertThat(board.invariant()).isTrue();
    }

    @Test
    void testSquareAt() {
        Square[][] table = new Square[1][1];
        board = new Board(table);
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
