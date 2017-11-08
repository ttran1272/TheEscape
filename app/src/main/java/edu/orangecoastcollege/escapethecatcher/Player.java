package edu.orangecoastcollege.escapethecatcher;

public class Player {
    private int mRow;
    private int mCol;

    public void move(int[][] gameBoard, String direction) {

        // TODO: Implement the logic for the move operation
        // TODO: If the gameBoard is obstacle free in the direction requested,
        // TODO: Move the player in the intended direction.  Otherwise, do nothing (player loses turn)

        if (direction == "LEFT")
        {
            if (gameBoard[mRow][mCol - 1] != BoardCodes.OBSTACLE)
                mCol--;
        }
        else if (direction == "RIGHT")
        {
            if (gameBoard[mRow][mCol + 1] != BoardCodes.OBSTACLE)
                mCol++;
        }
        else if (direction == "UP")
        {
            if (gameBoard[mRow - 1][mCol] != BoardCodes.OBSTACLE)
                mRow--;
        }
        else if (direction == "DOWN")
        {
            if (gameBoard[mRow + 1][mCol] != BoardCodes.OBSTACLE)
                mRow++;
        }
    }

    public void setRow(int row) {
        mRow = row;
    }

    public int getRow() {
        return mRow;
    }

    public void setCol(int col) {
        mCol = col;
    }

    public int getCol() {
        return mCol;
    }

}
