public class StringFor {
    public static void main(String args[]) {
        int i;
        StringBuffer a[] = new StringBuffer[3];
        for (i = 0; i < a.length; i++) {
            a[i] = new StringBuffer("ABC");
            a[i].setCharAt(i, 'X');
            System.out.println(a[i]);
        }
    }
}
