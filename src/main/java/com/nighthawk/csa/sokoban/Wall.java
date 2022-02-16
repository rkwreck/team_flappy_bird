package com.nighthawk.csa.sokoban;

import javax.swing.*;

public class Wall extends Tile {
    public ImageIcon iicon_wall;

    public Wall(int x, int y)
    {
        super(x, y);
    }

    public void changeWall (String wall)
    {
        iicon_wall = new ImageIcon("src/main/resources/" + wall + ".png");
        setImage(iicon_wall);
    }
}
