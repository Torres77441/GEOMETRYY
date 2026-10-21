public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(5,9);
        points[1] = new Point(9,2);
        points[2] = new Point(-1,9);
        points[3] = new Point(2,0);
        Polygon p = new Polygon(points);
        System.out.println(p);
        double l = p.getLength();
        p.setOffset(3,3);
        System.out.println(p);
        System.out.println(l);
    }
}
