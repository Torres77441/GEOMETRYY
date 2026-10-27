public class Main5 {
    public static void main(String[] args) {
        Point[] points;
        Rectangle[] rectangles;
        points = new Point[10];
        rectangles = new Rectangle[10];
        for (int i = 0 ; i < points.length ; i++){
            points[i] = new Point(i,i);
            System.out.println(points[i]);
            rectangles[i] = new Rectangle(new Point(i,i),1,1);
            System.out.print(rectangles[i]);
        }
    }
}
