package oop;

class Point {

    double calculateDistanceBetweenPoints(double x1, double y1, double x2, double y2) {

        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    void getMiddlePointBetweenTwoPoints(double x1, double y1, double x2, double y2){

        double z1 = (x1 + x2) / 2;
        double z2 = (y1 + y2) / 2;

        System.out.println("( "+z1+", "+z2+" )");
    }

    void isPointOnTheLine(double x1, double y1, double x2, double y2, double x, double y){

        double a = calculateDistanceBetweenPoints(x1, y1, x, y);
        double b = calculateDistanceBetweenPoints(x, y, x2, y2);
        double c = calculateDistanceBetweenPoints(x1, y1, x2, y2);

        if ( a + b == c) {
            System.out.println("Point is on the line");
        } else System.out.println("Point is Not on the line");

    }

    private static double areaOfTriangle(double x1, double y1, double x2, double y2,
                                         double x3, double y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }

    void isPointInsideTriangle(double x1, double y1, double x2,
                               double y2, double x3, double y3, double x, double y){

        double tr1 = areaOfTriangle(x1, y1, x2, y2, x3, y3);
        double tr2 = areaOfTriangle(x1, y1, x2, y2, x, y);
        double tr3 = areaOfTriangle(x1, y1, x3, y3, x, y);
        double tr4 = areaOfTriangle(x2, y2, x3, y3, x, y);

        if (tr2 + tr3 +tr4 == tr1){
            System.out.println("The Point belongs to a Triangle");
        } else System.out.println("The point is out of a triangle");
    }

    void isSquare(double x1, double y1, double x2,
                  double y2, double x3, double y3, double x4, double y4){

        double ab = calculateDistanceBetweenPoints(x1, y1, x2, y2);
        double bc = calculateDistanceBetweenPoints(x2, y2, x3, y3);
        double cd = calculateDistanceBetweenPoints(x3, y3, x4, y4);
        double da = calculateDistanceBetweenPoints(x4, y4, x1, y1);

        double ac = calculateDistanceBetweenPoints(x1, y1, x3, y3);
        double bd = calculateDistanceBetweenPoints(x2, y2, x4, y4);

        if (ab == bc && bc == cd && cd == da && ac == bd){
            System.out.println("Is a Square");
        } else System.out.println("Is not a Square");
    }
}
