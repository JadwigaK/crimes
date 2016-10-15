package investigations;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Jadwiga on 2016-10-13.
 */
public class Parser {
    public static Map<String,String> parseChildren(String children) {
        Map<String, String> output = new TreeMap<String,String>();
        String[] separated = children.split(",");
        for(String s: separated){
            output.put(s.split(" ")[0], s.split(" ")[1]);
        }
        return output;
    }

    public static Map<String,String> parseFeatures(String features) {
        Map<String, String> output = new TreeMap<String,String>();
        String[] separated = features.split(",");
        for(String s: separated){
            output.put(s.split(" ")[0], s.split(" ")[1]);
        }
        return output;
    }

}
