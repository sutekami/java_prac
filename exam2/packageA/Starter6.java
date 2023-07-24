package packageA;

public class Starter6 {
  public static void main(String args[]) {
    int a;
    packageB.Catcher6 catcher = new packageB.Catcher6();
    a = catcher.showResult(2, 3);
    System.out.println("2 + 3 = " + a);
  }
}
