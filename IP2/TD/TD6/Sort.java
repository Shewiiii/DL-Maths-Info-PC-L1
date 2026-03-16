package IP2.TD.TD6;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;

public class Sort {
    private LinkedList<String> sortlist;

    public Sort() {
        sortlist = new LinkedList<String>();
    }

    public void read(String file) throws IOException {
        File f = new File(file);
        Scanner in = new Scanner(f);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            this.sortlist.add(line);
        }
        in.close();
    }

    public void write(String file) throws IOException {
        PrintWriter out = new PrintWriter(file);
        int n = this.sortlist.size();
        for (int i = 0; i < n; i++) {
            String s = this.sortlist.get(i);
            out.println(s);
        }
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Sort s = new Sort();
        s.read(args[0]);
        Collections.sort(s.sortlist);
        s.write(args[1]);
    }
}
