package com.alexsucata.composition.pc_simulation;

public class Dimensions {
    private Integer width;
    private Integer height;
    private Integer depth;

    public Dimensions(Integer width, Integer height, Integer depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDepth() {
        return depth;
    }
}
