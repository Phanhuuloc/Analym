package loc.phan.analym.core;

import loc.phan.analym.core.utils.ValueComparator;

import java.util.*;

/**
 * Created by Locphan on 10/1/2016.
 */
public class TextExtractor {
    /**
     *
     */
    String text;
    /**
     * countWords
     */
    int wordCounts;
    /**
     *
     */
    int totalWordCounts;
    /**
     *
     */
    String[] wordsArray;
    /**
     *
     */
    List wordsList = new ArrayList<String>();
    /**
     *
     */
    Map sortedWordsMap;

    public TextExtractor(String text) {
        this.text = text;
    }

    public void extract(){
        countWords(this.text);
        putMap();
    }

    private void countWords(String text) {
        Set wordsSet  = new HashSet<String>();
        String tmp = text.replaceAll("[^\\p{L}\\p{Z}]","");
        wordsArray = tmp.split(" ");
        totalWordCounts = wordsArray.length;

        System.out.println(tmp);
        wordsSet.addAll(Arrays.asList(wordsArray));
        wordCounts= wordsSet.size();
        wordsList.addAll(wordsSet);

    }

    public void putMap(){
        HashMap m = new HashMap<String, Integer>();

        for (int i = 0; i < wordCounts; i++) {
            String index = wordsList.get(i).toString();
            int count = 0;
            for (int j = 0; j < totalWordCounts; j++) {
                if (index.equalsIgnoreCase(wordsArray[j])) {
                    count++;
                }
            }
            m.put(index,count);
        }

        Comparator comparator = new ValueComparator(m);
        sortedWordsMap = new TreeMap(comparator);
        sortedWordsMap.putAll(m);
    }

}
