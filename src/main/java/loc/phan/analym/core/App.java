package loc.phan.analym.core;

/**
 * Created by Locphan on 10/1/2016.
 */
public class App {
    public static void main(String[] args) {
        String text ="The following is a solution to sort a 88 wew!@#$%^&*()_+~!?>< map of <String, Integer> pairs. This is often used in counting frequency of words.";
        TextExtractor extractor = new TextExtractor(text);
        extractor.extract();

        System.out.println(extractor.wordsList);
        System.out.println(extractor.sortedWordsMap);
    }
}
