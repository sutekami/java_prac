import java.io.*;
import java.util.*;

public class FileRead2 {
    public static void main(String args[]) {
        String line, s, ss;
        try {
            BufferedReader f = new BufferedReader(new FileReader("Data3.txt"));
            while ((line = f.readLine()) != null) {
                ss = "";
                StringTokenizer tk = new StringTokenizer(line, " ");
                while (tk.hasMoreTokens()) {
                    try {
                        s = tk.nextToken();
                        if ('.' == s.charAt(s.length() - 1))
                            ss += s + "\n";
                        else
                            ss += s + " ";
                    } catch (NoSuchElementException e0) {
                        System.out.println("No Token");
                    }
                }
                System.out.print(ss);
            }
            f.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Not File");
        } catch (IOException e2) {
            System.out.println("Cannot Open");
        }
    }
}
