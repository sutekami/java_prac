public class Starter5 {
  public static void main(String args[]) {
    int a;
    Catcher5 catcher;

    catcher = new Catcher5();

    try {
      a = catcher.doCalc(args[0], 2, 3);
      System.out.println("2 " + args[0] + " 3 = " + a);
    } catch (Exception e) {
      System.out.println("invalid operator");
    }
  }
}
