package com.szhou.trianglechallenge;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shape {

    private String name;
    
    /**
     * Create a shape with the name
     * @param edges
     */
    public Shape(List<Integer> edges) {
        SubShape s = null;
        try {
            Set<Integer> uniqueEdges = new HashSet<Integer>(edges);
            if(uniqueEdges.contains(0)) {
                throw new IllegalArgumentException("Zeroes not allowed in input");
            }
            
            s = ShapeInfo.getShapesInfo().get(edges.size()).get(uniqueEdges.size());
        } catch(NullPointerException e) {
            throw new IllegalArgumentException("Invalid number of edges");
        }
        this.name = s.name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
