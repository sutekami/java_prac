public class Catcher5 {
  public int doCalc(String operator, int x, int y) throws Exception {
    int result;
    if (operator.equals("+"))
      result = x + y;
    else if(operator.equals("-"))
      result = x - y;
    else
      throw new Exception();
    return result;
  }
}
