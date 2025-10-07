package Day5;
//same method name but different parameters
public class Area {
    static double area(double r){
        if(r<0) throw new IllegalArgumentException("Radius must be non-negative");
        return Math.PI*r*r;
    }
    static int area(int l, int b){
        if(l<0|| b<0) throw new IllegalArgumentException(("sides must be non-negative"));
        return l*b;
    }
    static double area( double b,double h){
        if(b<0|| h<0) throw new IllegalArgumentException(("sides must be non-negative"));
        return 0.5*b*h;
    }

    public static void main (String[] args){
        System.out.println("Area of circle " + area(5));
        System.out.println("Area of rectangle "+ area(5,7));
        System.out.println("Area of triangle "+ area(2,3));
    }
}
