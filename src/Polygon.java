import javax.swing.*;

public class Polygon {
    private Point[] points;

    public Polygon(Point ... points){
        this.points = points;
    }

    public Polygon(){
        points = new Point[100];
        for (int i = 0; i < points.length; i++){
            points[i] = null;
        }
    }

    @Override
    public String toString(){
        String print = "";
        for (int i = 0; i < points.length ; i++){
            print += "(" +points[i].getX() + "," + points[i].getY() + ") - ";
        }
        print += "(" +points[0].getX() + "," + points[0].getY() + ")";
        return print;
    }

    public double getLength(){
        double length = 0 ;
        for (int i = 0; i < points.length - 1 ; i++) {
            Segment side = new Segment(points[i], points[i + 1]);
            length += side.getModule();
        }
        Segment side = new Segment(points[points.length-1], points[0]);
        length += side.getModule();
        return length;
    }

    public void setOffset(int offX,int offY){
        for(int i = 0; i < points.length; i++){
            points[i].setOffset(offX, offY);
        }
    }
}
