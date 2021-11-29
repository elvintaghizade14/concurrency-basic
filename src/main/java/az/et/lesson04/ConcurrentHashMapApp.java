package az.et.lesson04;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApp {
    private final ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public Object get(String key) {
        return map.get(key);
    }
}