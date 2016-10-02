package loc.phan.analym.core;

import loc.phan.analym.core.utils.TikaParser;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * Created by Locphan on 10/1/2016.
 */
public class App {
    public static void main(String[] args) {
        String filePath = "D:\\EBOOK PROPRAMING\\ManningTikainActionNov2011.pdf";
        String text = "";
        try {
            text = TikaParser.docToString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TikaException e) {
            e.printStackTrace();
        }
        TextExtractor extractor = new TextExtractor(text.toLowerCase());
        extractor.extract();

        System.out.println(extractor.wordCounts);
        System.out.println(extractor.totalWordCounts);
        System.out.println(extractor.sortedWordsMap);
    }
}
