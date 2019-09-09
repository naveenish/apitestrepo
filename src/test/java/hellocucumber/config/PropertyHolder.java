package hellocucumber.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PropertyHolder {

    private Map<String, Object> data = new HashMap<>();

    public <T> T get(String key, Class<T> type) {
        if (this.data.containsKey(key)) {
            return type.cast(this.data.get(key));
        }
        return null;
    }

    public void put(String key, Object value) {
        this.data.put(key, value);
    }

    public void clear() {
        this.data.clear();
    }
}
