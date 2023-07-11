public class Test3 {
    public static void main(String args[]) {
        Enzan e = new Enzan();
        Tasu t = e.ikkou();
        t.plus(2,3);
        System.out.println(t.d);
    }
}