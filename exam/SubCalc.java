public class SubCalc extends SuperCalc {
    public void calc(int x, int y) {
        super.calc(x, y);
        answer = x - y;
        System.out.println(answer);
    }
}
