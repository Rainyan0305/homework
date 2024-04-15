public class JPA506 {
    public static void main(String[] args) {
        double i = calcirucle(5, 3.1415926);
        double k = calTriangle(10, 5);
        int m = calRectangle(10, 5);
        double totla = i+k+m;
        System.out.printf("圓形面積為%.6f\n", i);
        System.out.printf("三角形面積為%.6f\n", k);
        System.out.printf("長方形面積為%d\n",m);
        System.out.printf("此圖形面積為%.6f\n", totla);

    }
    public static double calcirucle(double n, double pi){
        return Math.pow(n,2)*pi;

    }
    public static double calTriangle(double n , double pi){
        return n*pi/2;
    }
    public static int calRectangle(int n , int pi){
        return n*pi;
    }
    
}
