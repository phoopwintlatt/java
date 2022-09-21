//The fields of the Line class will be a, b and c, all of type double.
public class Line {
    double a;
    double b;
    double c;

    public Line(){}

    public Line(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Line "+a+"x+"+b+"y="+c+" is created.");
    }

    public void getLine(){
        System.out.println("Line "+a+"x+"+b+"y="+c+" is created.");
    }

    //Create a method contains(p), which decides whether the point p lies on the line.
    public void pointsOnLine(Point point){
        double m;
        m = (a * point.x)+(b * point.y);
        if( c == m ){
            System.out.println("Point: ("+ point.x+","+point.y+") is on the line!");
        }else
            System.out.println("Point: ("+ point.x+","+point.y+") is NOT on the line!");
    }

    //Create the methods isParallelWith(l) and isOrthogonalTo(l), which decide,
    //respectively, whether a line is parallel to and orthogonal (perpendicular) to the line l
    //provided as a parameter.
    public void isParallelWith(Line line){
        if( ((-a)/b) == ((-line.a)/ line.b) ){
            System.out.println("These two lines are parallel!");
        }else
            System.out.println("These two lines are NOT parallel!");

    }

    public void isOrthogonalTo(Line line){
        if( ((-a)/b) == -((line.b)/ (-line.a)) ){
            System.out.println("These two lines are perpendicular!");
        }else
            System.out.println("These two lines are NOT perpendicular!");

    }



}
