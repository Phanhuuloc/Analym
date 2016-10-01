package loc.phan.analym.core.utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Locphan on 10/1/2016.
 */
public class SortUtils {
    public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
        Comparator<String> comparator = new ValueComparator(map);
        //TreeMap is a map sorted by its keys.
        //The comparator is used to sort the TreeMap by keys.
        TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
        result.putAll(map);
        return result;
    }
}
