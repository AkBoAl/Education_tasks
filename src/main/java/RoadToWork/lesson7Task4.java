package RoadToWork;

public class lesson7Task4 {
    public static void main(String[] args) {
        System.out.println(calculate(15) + "   xxp" );
    }

    public static double calculate(double n) {
        return buildExpression(n, (int)n);
    }
    public static double buildExpression(double x, int step) {
        return step == 0 ? x: buildExpression(step-1 + Math.sqrt(x), step-1);
    }
}
