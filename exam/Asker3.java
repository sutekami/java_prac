public class Asker3 {
    public static void main(String args[]) {
        Asker3 asker = new Asker3();
        SubCalc3 subCalculator = new SubCalc3();
        asker.display(subCalculator);
        SuperCalc3 superCalculator = new SuperCalc3();
        asker.display(superCalculator);
    }
    
    void display(SuperCalc3 calclator) {
        System.out.println(calclator.calc(10, 5));
    }
}
