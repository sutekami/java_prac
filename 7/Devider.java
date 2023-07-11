public class Devider {
    public double devide(double a, double b) throws DevidingException {
        double z;
        z = a / b;
        if (Double.isNaN(z) || Double.isInfinite(z))
            throw new DevidingException();
        return z;
    }
}