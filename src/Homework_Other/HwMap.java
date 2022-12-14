package Homework_Other;

import java.util.HashMap;
import java.util.Map;

public class HwMap {
    HashMap<String, Integer> map = new HashMap<>();
    public void addMap(String val, Integer num) {
        if (map.containsKey(val) && map.containsValue(num)) {
            throw new IllegalArgumentException("Параметры уже добавлены.");
        } else if (map.containsKey(val) && !map.containsValue(num)) {
            map.replace(val, num);
        } else {
            map.put(val, num);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(map);
    }
}

