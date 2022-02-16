package com.nighthawk.csa.sokoban;

import javax.swing.*;

public class Area extends Tile {
    ImageIcon iicon_final = new ImageIcon("src/main/resources/static/images/finalarea.png");

    public Area(int x, int y)
    {
        super(x, y);

        setImage(iicon_final);
    }
}