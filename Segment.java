//Create the class Segment representing line segments on a plane. This class will have
//four fields of type double: the coordinates of the two endpoints of the segment (x1, y1,
//x2, y2).
//Create a method line() which returns a Line object representing the line that covers
//the segment.
//Create a method contains(p) which decides whether the point p lies on the segment.

public class Segment {
    double x1;
    double x2;
    double y1;
    double y2;

    void Segment(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Line createLine(Segment s){
        double m = (y2-y1)/(x2-x1);
        //System.out.println(m);//1 >> y2+10=1(x2+10) >> y+10=x2+10
        //y2-y1=m*x2-m*x1; y-4=2x-6; y=2x-2;
        double a = -m;
        double b = 1;
        double c = y1-(m*x1);
        Line l = new Line(a,b,c);
        return (l);
    }

    public boolean pointExistCheck(Point p){
        double m = (y2-y1)/(x2-x1);
        return (((y2-p.y)/(x2-p.x))==m)? true:false;
    }


}
