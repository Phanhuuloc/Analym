package loc.phan.analym.core.demo;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Locphan on 10/2/2016.
 */
public class TikaParserDemo {
    public static void main(String[] args) throws IOException,SAXException, TikaException {
//        //Assume sample.txt is in your current directory
//        File file = new File("D:\\EBOOK PROPRAMING\\ManningTikainActionNov2011.pdf");
//
//        //parse method parameters
//        Parser parser = new AutoDetectParser();
//        BodyContentHandler handler = new BodyContentHandler(-1);
//        Metadata metadata = new Metadata();
//        FileInputStream inputstream = new FileInputStream(file);
//        ParseContext context = new ParseContext();
//
//        //parsing the file
//        parser.parse(inputstream, handler, metadata, context);
//        System.out.println("File content : " + handler.toString());
    }
}
