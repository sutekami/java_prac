public class Asker1 {
    public static void main(String args[]) {
        int z;

        Responder1 responder = new Responder1(5, 3);
        z = responder.answer();
        System.out.println(z);
    }
}
