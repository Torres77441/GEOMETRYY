import javax.swing.*;

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points){
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
        int c1,c2;
        for (int i = 0; i < points.length - 1 ; i++){
            c1 = points[i+1].getX() - points[i].getX();
            c2 = points[i+1].getY() - points[i].getY();
            length += Math.sqrt(c1 * c1 + c2 * c2);
        }
        c1 = points[0].getX() - points[points.length - 1].getX();
        c2 = points[0].getY() - points[points.length - 1].getY();
        length += Math.sqrt(c1 * c1 + c2 * c2);
        return length;
    }

    public void setOffset(int offX,int offY){
        for(int i = 0; i < points.length; i++){
            points[i].setOffset(offX, offY);
        }
    }
}
