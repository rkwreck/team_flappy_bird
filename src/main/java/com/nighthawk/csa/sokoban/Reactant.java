package com.nighthawk.csa.sokoban;

import javax.swing.*;

public class Reactant extends Moving {

    public ImageIcon iicon_reactant_1 = new ImageIcon("src/main/resources/static/images/beaker1.png");
    public ImageIcon iicon_reactant_2 = new ImageIcon("src/main/resources/static/images/beaker2.png");
    public ImageIcon iicon_reactant_3 = new ImageIcon("src/main/resources/static/images/beaker3.png");
    public ImageIcon iicon_reactant_4 = new ImageIcon("src/main/resources/static/images/beaker4.png");

    public Reactant(int x, int y)
    {
        super(x, y);

        setImage(iicon_reactant_1);
    }
}
