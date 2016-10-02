package loc.phan.analym.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Locphan on 10/2/2016.
 */
public class WordsFilter {
    public static Set<String> getFilterSet(String filePath){
        SimpleReadText simpleReadText = new SimpleReadText();
        String text = (simpleReadText.read(filePath)).replaceAll("\\W",",");

        Set<String> s= new HashSet<String>();
        s.addAll(Arrays.asList(text.split(",")));

        return s;
    }
}
