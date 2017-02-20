package com.szhou.trianglechallenge;

import java.util.List;

public class ShapeTypeDeterminer {

    /**
     * Instantiate shapes info
     */
    public ShapeTypeDeterminer() {
        ShapeInfo.setShapesInfo();
    }

    /**
     * Given a set of edges, return the shape
     * @param edges
     * @return
     */
    public Shape determineShape(List<Integer> edges) {
        return new Shape(edges);
    }
}
