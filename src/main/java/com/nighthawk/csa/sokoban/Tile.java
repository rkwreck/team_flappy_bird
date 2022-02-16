package com.nighthawk.csa.sokoban;

import javax.swing.*;
import java.awt.*;

public class Tile {
    public int x;
    public int y;
    public Image image;

    public Tile(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setImage(ImageIcon iicon)
    {
        image = iicon.getImage();
    }
}
