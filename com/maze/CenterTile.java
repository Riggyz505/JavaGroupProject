package com.maze;

public class CenterTile extends MazeTile{
    public CenterTile() {
        this.type = "C";
        this.ePath = true;
        this.sPath = true;
        this.nPath = true;
        this.wPath = true;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public boolean isnPath() {
        return super.isnPath();
    }

    @Override
    public void setnPath(boolean nPath) {
        super.setnPath(nPath);
    }

    @Override
    public boolean isePath() {
        return super.isePath();
    }

    @Override
    public void setePath(boolean ePath) {
        super.setePath(ePath);
    }

    @Override
    public boolean issPath() {
        return super.issPath();
    }

    @Override
    public void setsPath(boolean sPath) {
        super.setsPath(sPath);
    }

    @Override
    public boolean iswPath() {
        return super.iswPath();
    }

    @Override
    public void setwPath(boolean wPath) {
        super.setwPath(wPath);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
