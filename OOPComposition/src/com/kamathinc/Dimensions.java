package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Dimensions {
    private int height;
    private int width;
    private int depth;

    public Dimensions(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
