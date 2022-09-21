public class Main {
    public static void main(String[] args) {
//        Point p1 = new Point();
//        double x=0;
//        double y=4;
//        p1.point(x,y);
//
//        Line l1 = new Line(2,3,12);
//        l1.pointsOnLine(p1);
//
//        Line l2 = new Line(2,3,15);
//        //l2.Line(2,3,15);//3y+2x=15
//        Line l3 = new Line(-3,2,10);
//        //l3.Line(-3,2,10);//2y-3x=10
//        l1.isParallelWith(l2);
//        l1.isOrthogonalTo(l3);
//        System.out.println();
//
//        //segment_exercise
//        Segment s1 = new Segment();
//        s1.Segment(-10,10,-10,10);
//        Line l4= new Line();
//        l4= s1.createLine(s1);
//        System.out.println(s1.pointExistCheck(p1));
//
//        Point p2 = new Point();
//        p1.point(0,5);
//        System.out.println(s1.pointExistCheck(p2));

        //complex_exercise
        ComplexNumber cm = new ComplexNumber();
        cm.ComplexNumber(20,-4);
        cm.conjugate(cm);
        cm.reciprocate(cm);

        ComplexNumber cm2 = new ComplexNumber();
        cm2.ComplexNumber(3,2);
        cm.div(cm2);
    }
}