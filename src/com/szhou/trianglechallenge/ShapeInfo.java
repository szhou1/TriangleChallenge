package com.szhou.trianglechallenge;

import java.util.HashMap;

public class ShapeInfo {
    
    /**
     * Maps the number of edges with another map which maps unique edges with the name
     */
    private static HashMap<Integer, HashMap<Integer, SubShape>> shapesMap;
    
    public static void setShapesInfo() {
        if(shapesMap != null) return;
        
        shapesMap = new HashMap<Integer, HashMap<Integer, SubShape>>();
        
        HashMap<Integer, SubShape> triangleMap = new HashMap<Integer, SubShape>();
        triangleMap.put(1, new SubShape(Constants.EQUILATERAL));
        triangleMap.put(2, new SubShape(Constants.ISOSCELES));
        triangleMap.put(3, new SubShape(Constants.SCALENE));
        shapesMap.put(3, triangleMap);
        
        HashMap<Integer, SubShape> quadrilateralMap = new HashMap<Integer, SubShape>();
        quadrilateralMap.put(1, new SubShape(Constants.SQUARE));
        quadrilateralMap.put(2, new SubShape(Constants.RECTANGLE));
        quadrilateralMap.put(4, new SubShape(Constants.TRAPEZOID));
        shapesMap.put(4, quadrilateralMap);
        
    }
    
    public static HashMap<Integer, HashMap<Integer, SubShape>> getShapesInfo() {
        if(shapesMap == null) {
            setShapesInfo();
        }
        return shapesMap;
    }
    
    

}
