package study.mirea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringByASCIISorter implements StringSorter {
    public List<String> sort(List<String> strings) {
        List<String> result = new ArrayList<>(strings);
        Collections.sort(result);
        return result;
    }
}
