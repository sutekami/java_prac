public class Calc2 extends Tasu{
    public void plus(int x, int y) {
        d = x * y;
    }
    public void disp(int a, int b) {
        super.plus(a, b);
        System.out.println(d);
        this.plus(a, b);
        System.out.println(d);
    }
}
