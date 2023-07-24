public class Calculation {
    private int calc(int m, int n) {
        return (m * n);
    }

    public int calc(int m) {
        return (m * m);
    }

    int access(int m, int n) {
        return calc(m , n);
    }
}
