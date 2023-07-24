public class Asker5 {
  public static void main(String args[]) {
    int z;
    Calculation5 calculation = new Calculation5();
    try {
      z = calculation.calc(Integer.parseInt(args[0]));
      System.out.println(z);
    } catch (Exception e) {
      System.out.println("out of range");
    }
  }
}
