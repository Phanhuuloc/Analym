package loc.phan.analym.core;

import loc.phan.analym.core.utils.ValueComparator;

import java.util.*;

/**
 * Created by Locphan on 10/1/2016.
 */
public class TextExtractor extends Extractor {

    public TextExtractor(String text) {
        super(text);
    }

    public TextExtractor(String text, ExtractConfig config) {
        super(text, config);
    }

//    String processFilter(String text, Set<String> wordsFilter) {
//        for (String s : wordsFilter) {
//            text = text.replaceAll(s," ");
//        }
//        return text;
//    }
}
