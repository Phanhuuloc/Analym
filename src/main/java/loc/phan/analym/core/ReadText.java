package loc.phan.analym.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Locphan on 10/2/2016.
 */
public class ReadText {

    public static void main(String[] args) {

ReadText r = new ReadText();
        String s = r.read("");
        System.out.println(s);
    }

    public String read(String filePath) {
        BufferedReader br = null;
        String text = "";
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("D:\\EXAMPLE_CODE\\JAVA\\Analym\\src\\main\\resources\\file\\text\\text.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                text += sCurrentLine+" \n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return text;
    }
}
