public class Starter4 {
  public static void main(String args[]) {
    int a, b;
    Starter4 starter;
    Catcher4 catcher;

    starter = new Starter4();
    catcher = new Catcher4();

    a = starter.doCalc(catcher, 2, 3);
    System.out.println("2 + 3 = " + a);
  }

  public int doCalc(Catcher4 obj, int x, int y) {
    int result;
    result = obj.plus(x, y);
    return result;
  }
}
