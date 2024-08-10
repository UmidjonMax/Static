public class MathFunctions {
    static double PI,E;

    public MathFunctions(double pi, double e){
        PI = pi;
        E = e;
    }
    public double area(double radius){
        return PI*radius*radius;
    }
    public double eona(int a){
        return Math.pow(E, a);
    }

    public double triarea(double A, double B, double C) {
        double p = (A+B+C)/2;
        return Math.sqrt(p*(p-A)*(p-B)*(p-C));
    }
}
