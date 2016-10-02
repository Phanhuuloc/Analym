package loc.phan.analym.core;

import loc.phan.analym.core.utils.ValueComparator;

import java.util.*;

/**
 * Created by Locphan on 10/2/2016.
 */
public abstract class Extractor {
    /**
     * Text to be extract
     */
    String text;
    /**
     * the extract process with config
     */
    ExtractConfig config;
    /**
     * count words
     */
    int wordCounts;
    /**
     * count total words
     */
    int totalWordCounts;
    /**
     *
     */
    String[] wordsArray;
    /**
     *
     */
    Set<String> wordsSet = new HashSet<String>();
    /**
     *
     */
    Map sortedWordsMap;

    public Extractor(String text) {
        this.text = text;
    }

    public Extractor(String text, ExtractConfig config) {
        this.text = text;
        this.config = config;
    }

    public void extract() {
        processWords();
        putMap();
    }

    public void processWords() {
        String tmp = text.replaceAll("[^\\p{L}\\p{Z}]", " ");
        countWords(tmp);
    }

    public Set processFilter(Set<String> wordsSet, Set<String> wordsFilter){
        ArrayList<String> l = new ArrayList<String>(wordsSet);
        ArrayList<String> f = new ArrayList<String>(wordsFilter);
        for (String filter : f) {
            for (String word : l) {
                if (filter.equalsIgnoreCase(word.trim())) {
                    wordsSet.remove(word);
                }
            }
        }

        return wordsSet;
    }

    void countWords(String text) {
        System.out.println(text);
        wordsArray = text.split("\\s+");
        totalWordCounts = wordsArray.length;

        wordsSet.addAll(Arrays.asList(wordsArray));
        if (null != config && null != config.getWordsFilter()) {
            wordsSet = processFilter(wordsSet, config.getWordsFilter());
        }
        wordCounts = wordsSet.size();
    }

    public void putMap(){
        HashMap m = new HashMap<String, Integer>();

        for (String index : wordsSet) {
            int count = 0;
            for (int j = 0; j < totalWordCounts; j++) {
                if (index.equalsIgnoreCase(wordsArray[j])) {
                    count++;
                }
            }
            m.put(index, count);
        }

        Comparator comparator = new ValueComparator(m);
        sortedWordsMap = new TreeMap(comparator);
        sortedWordsMap.putAll(m);
    }
}
