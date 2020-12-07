package oop;

import org.junit.Test;

public class TestApi {

    private Point point= new Point();

    @Test
    public void testCalculateDistanceBetweenTwoPoints(){

        double result = point.calculateDistanceBetweenPoints(1, 3, 3, 3);
        System.out.println(result);
    }

    @Test
    public void testGetMiddlePoint(){

        point.getMiddlePointBetweenTwoPoints(-5, 4, 3, 2);
    }

    @Test
    public void testIsPointOnTheLine(){

       point.isPointOnTheLine(-5, 4, 3,2, -1, 3);
    }

    @Test
    public void testIsPointInsideATriangle(){

        point.isPointInsideTriangle(4, -3, 7, 7, -6, 5, 3, 3);
    }

    @Test
    public void testIsSquare(){

        point.isSquare(1, 1, 1, 3, 3, 3, 3, 1);
    }

}
