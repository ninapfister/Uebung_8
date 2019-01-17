import java.io.*;
import java.util.ArrayList;

public class Aufgabe1
{
    public static void main (String[]args)
    {
        // null damit System weiß, dass es das gibt

        File file = null; // Pfad zu test.txt Datei
        FileReader fr = null; // ließt File ein
        BufferedReader br = null; // man bekommt Zugriff auf das File

        // im try Block wird es befüllt
        try {
            file = new File("C:\\Users\\Nina Pfister\\Desktop\\Software Übung´\\test.txt"); //relativer Pfad im Projekt
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            ArrayList<String> arrayList = new ArrayList();

            while (true) {
                String zeile = br.readLine();
                if (zeile == null) break;
                arrayList.add(zeile);
            }

            for (String s : arrayList) {
                System.out.println(s);
            }
        }
         catch (Exception ex)
        {
            ex.printStackTrace();
        }

        finally
            {
                try
                {
                  br.close(); // damit es den geöffneten File schließt - wegen Speicher
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
    }
}
