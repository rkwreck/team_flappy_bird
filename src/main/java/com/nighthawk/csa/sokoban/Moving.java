package com.nighthawk.csa.sokoban;

import java.util.ArrayList;


public class Moving extends Tile {
    private int dx;
    private int dy;

    protected int[] pos = new int[2];
    protected ArrayList<int[]> moves = new ArrayList<>();

    public Moving(int x, int y)
    {
        super(x, y);
        dx = x;
        dy = y;
    }

    public void move(int x, int y)
    {
        dx = this.x + x;
        dy = this.y + y;

        setX(dx);
        setY(dy);
    }

    public void savePos()
    {
        moves.add(new int[] {x, y});
    }

    public void undoMove ()
    {
        pos = moves.get(moves.size() - 1);
        setX(pos[0]);
        setY(pos[1]);
        moves.remove(moves.size() - 1);
    }

    /*  public boolean isLeftCollision(Tile tile) { return x - Board.SPACE == tile.x && y == tile.y; }

    public boolean isRightCollision(Tile tile)
    {
        return x + Board.SPACE == tile.x && y == tile.y;
    }

    public boolean isTopCollision(Tile tile)
    {
        return x == tile.x && y - Board.SPACE == tile.y;
    }

    public boolean isBottomCollision(Tile tile)
    {
        return x == tile.x && y + Board.SPACE == tile.y;
    }

     */
}
