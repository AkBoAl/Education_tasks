package RoadToWork;

public class lesson7Task4 {
    public static void main(String[] args) {
        System.out.println(calculate(15));

    }

    public static double calculate(int n) {
        return buildExpression(n, n);
    }
    public static double buildExpression(double n, int step) {
        return step == 0 ? n: buildExpression(step-1 + Math.sqrt(n), step-1);
    }
}
