public class Rectangle extends  Point{
    private int width;
    private int height;

    public Rectangle(){
        super();
        width = 4;
        height = 2;
    }
    public Rectangle(Point p, int newWidth, int newHeight){
        super(p.getX(), p.getY());
        height = newHeight;
        width = newWidth;
    }

    @Override
    public String toString(){
        return super.toString() + " º|º  width: " + width + " | height: " + height;
    }

    public Rectangle(Segment segment){
        super();
        int x, y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (startPoint.getX() < endPoint.getX()){
            x = startPoint.getX();
            width = endPoint.getX() - startPoint.getX();
        } else {
            x = endPoint.getX();
            width = startPoint.getX() - endPoint.getX();
        }
        if (startPoint.getY() < endPoint.getY()){
            y = startPoint.getY();
            height = endPoint.getY() - startPoint.getY();
        } else {
            y = endPoint.getY();
            height = startPoint.getY() - endPoint.getY();
        }
        setX(x);
        setY(y);

        /*
        setX(segment.getStartPoint().getX() < segment.getEndPoint().getX() ? segment.getStartPoint().getX() : segment.getEndPoint().getX());
        setY(segment.getStartPoint().getY() < segment.getEndPoint().getY() ? segment.getStartPoint().getY() : segment.getEndPoint().getY());
        */
    }

    public int getArea(){
         int Area = width * height;
        return Area;
    }

    public Point getPoint(){
        return this;
    }
    public Point getTopLeftPoint(){
        return new Point(getX(),getY()+height);
    }
    public Point getTopRightPoint(){
        return new Point(getX()+width,getY()+height);
    }
    public Point getBottomLeftPoint(){
        return new Point(getX(),getY());
    }
    public Point getBottomRighPoint(){
        return new Point(getX()+width,getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(Point p1, Point p2){
        super(p1.getX(),p1.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }
}
