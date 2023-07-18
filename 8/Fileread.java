import java.io.*;
import java.util.*;

public class Fileread {
    public static void main(String args[]) {
        String line, s, ss;
        try {
            BufferedReader f = new BufferedReader(new FileReader("Data2.txt"));
            while ((line = f.readLine()) != null) {
                ss = "";
                StringTokenizer tk = new StringTokenizer(line, " ");
                while (tk.hasMoreTokens()) {
                    try {
                        if (ss.equals("") == false)
                            ss += " ";
                        s = tk.nextToken();
                        if (s.equals("some"))
                            s = "few";
                        ss += s;
                    } catch (NoSuchElementException e0) {
                        System.out.println("No token");
                    }
                }
                ss += ".";
                System.out.println(ss);
            }
            f.close();
        } catch (FileNotFoundException e1) {
            System.out.println("No file");
        } catch (IOException e2) {
            System.out.println("Cannot Open");
        }
    }
}