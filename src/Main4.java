public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.moveTo(4 , 7);
        System.out.println(r);
        Rectangle r2 = new Rectangle(new Point (1,1), 8 ,  6);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(new Point(2,0), new Point(4,2));
        System.out.println(r3);
        Rectangle r4 = new Rectangle(new Segment(new Point(2,2), new Point(4,0) ));
        System.out.println(r4);
        System.out.println(r4.getArea());
        System.out.println(r4.getPoint());
        System.out.println(r4.getTopLeftPoint());
        System.out.println(r);
        Rectangle r5 = new Rectangle(new Point(5,6), 10, 8);
        System.out.println(r5);
        System.out.println("Arriba izquierda = "+r5.getTopLeftPoint()+ " Arriba derecha = "+r5.getTopRightPoint()
                + " Abajo izquierda = " + r5.getBottomLeftPoint() + " Abajo derecha = " + r5.getBottomRighPoint());
    }
}
