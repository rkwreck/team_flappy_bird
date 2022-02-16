package com.nighthawk.csa.sokoban;

import javax.swing.*;

public class Scientist extends Moving {
    public ImageIcon iicon_scientist;

    public Scientist(int x, int y)
    {

        super(x, y);
        setImage(iicon_scientist);
    }

    @Override
    public void undoMove()
    {
        pos = moves.get(moves.size() - 1);

        super.undoMove();
    }
}
