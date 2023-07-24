public class Calculation5 {
  public int calc(int m) throws UpperException, LowerException {
    if (m > 100)
      throw new UpperException();
    else if (m < 0)
      throw new LowerException();
    return m * m;
  }
}
