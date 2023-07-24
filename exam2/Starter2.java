public class Starter2 {
  public static void main(String args[]) {
    int a, b;
    Catcher2 catcher;

    catcher = new Catcher2();

    a = catcher.plus(2, 3);
    b = catcher.multiply(2, 3);

    System.out.println("2 + 3 = " + a + "\n2 * 3 = " + b);
  }
}
