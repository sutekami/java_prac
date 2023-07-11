import java.lang.Double;

public class ExceptionEx {
    public static void main(String args[]){
        double x, y, z;
        Devider devider = new Devider();

        x = Double.parseDouble(args[0]);
        y = Double.parseDouble(args[1]);

        try {
            z = devider.devide(x, y);
            System.out.println(z);
        } catch (DevidingException e) {
            System.out.println("Input error");
        }
    }
}
