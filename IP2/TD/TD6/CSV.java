package IP2.TD.TD6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class CSV {
    private LinkedList<String[]> csvList;

    CSV() {
        csvList = new LinkedList<>();
    }

    public void file2csv(String file) throws IOException {
        File f = new File(file);
        Scanner in = new Scanner(f);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            this.csvList.add(line.split(","));
        }
        in.close();
    }

    public String unSplit(String[] stringArray, String separator) {
        String acc = "";
        if (stringArray.length == 0) {
            return "";
        }
        acc = stringArray[0];
        for (int i = 1; i < stringArray.length; i++) {
            acc = acc + separator + stringArray[i];
        }
        return acc;
    }

    public void csv2file(String file) throws IOException {
        PrintWriter out = new PrintWriter(file);
        int n = this.csvList.size();
        for (int i = 0; i < n; i++) {
            String[] sa = this.csvList.get(i);
            out.println(unSplit(sa, ", "));
        }
        out.close();
    }

    public static void main(String[] args) {
        CSV csv = new CSV();
        try {
            csv.file2csv("C:\\Users\\Shewi\\Documents\\!UNIVERSITE\\DL-Maths-Info-PC-L1\\IP2\\TD\\TD6\\test.csv");
            csv.csv2file("C:Users\\Shewi\\Documents\\!UNIVERSITE\\DL-Maths-Info-PC-L1\\IP2\\TD\\TD6\\result.csv");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
