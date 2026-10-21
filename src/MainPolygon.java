public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = {new Point(5,5), new Point(5,20), new Point(10,20), new Point(10,5) };
        Polygon p = new Polygon(points);
        System.out.println(p);
        double l = p.getLength();
        p.setOffset(3,3);
        System.out.println(p);
        System.out.println(l);
    }
}