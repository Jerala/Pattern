package study.mirea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringByLengthSorter implements StringSorter {
    public List<String> sort(List<String> strings) {
        List<String> result = new ArrayList<>(strings);
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1Length = o1.length();
                int o2Length = o2.length();
                if (o1Length > o2Length) {
                    return 1;
                } else if (o1Length < o2Length) {
                    return -1;
                }
                return 0;
            }
        });
        return result;
    }
}
