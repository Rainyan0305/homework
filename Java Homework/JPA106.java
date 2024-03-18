public class JPA106 {
    public static void main(String args[]){
        double result1 = Calcution(-3.2);
        System.out.printf("f(-3.2) = %.4f%n",result1);

        double result2 = Calcution(-2.1);
        System.out.printf("f(-2.1) = %.4f%n",result2);

        double result3 = Calcution(0);
        System.out.printf("f(0) = %.4f%n",result3);

        double result4 = Calcution(2.1);
        System.out.printf("f(2.1) = %.4f%n",result4);
    
    }
    private static double Calcution(double x){
        return 3*Math.pow(x,3)+2*x-1;
    }
}
