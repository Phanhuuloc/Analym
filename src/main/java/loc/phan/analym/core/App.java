package loc.phan.analym.core;

import loc.phan.analym.core.utils.TikaParser;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import java.io.IOException;

import java.util.Set;

/**
 * Created by Locphan on 10/1/2016.
 */
public class App {
    public static void main(String[] args) {

        //parse doc
//        String filePath = "D:\\EBOOK PROPRAMING\\ManningTikainActionNov2011.pdf";
        String filePath = "D:\\EBOOK PROPRAMING\\HeadFirst\\Head_First_Java_Second_Edition.pdf";
        String filterPath = "src\\main\\resources\\file\\filter\\filter.txt";

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

        //config
        ExtractConfig config = new ExtractConfig();

        Set<String> filterSet = WordsFilter.getFilterSet(filterPath);

        config.setWordsFilter(filterSet);

        Extractor extractor = new TextExtractor(text.toLowerCase(),config);
        extractor.extract();

        System.out.println(extractor.wordCounts);
        System.out.println(extractor.totalWordCounts);
        System.out.println(extractor.sortedWordsMap);
    }
}
