public class Main {
    public static void main(String[] args) {
        MathFunctions mthfnc = new MathFunctions(3.14159265359, 2.71828182846);
        double area = mthfnc.area(5);
        System.out.println("Aylananing yuzasi "+area+" ga teng");
        double edaraja = mthfnc.eona(3);
        System.out.println("e = "+edaraja);
        double triarea = mthfnc.triarea(4, 5, 3);
        System.out.println("Uchburchakning yuzi = "+triarea);
    }
}