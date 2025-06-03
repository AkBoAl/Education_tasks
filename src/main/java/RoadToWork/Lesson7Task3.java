package RoadToWork;

public class Lesson7Task3 {
    public static void main(String[] args) {
        System.out.println(recursFaktorial(4));
    }

    public static int recursFaktorial(int n) {
        return n == 1 || n == 0 ? n : n * recursFaktorial(n-1);
    }
}
