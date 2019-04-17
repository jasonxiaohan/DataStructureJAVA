package Map;

/**
 * 映射类接口
 * @param <K>
 * @param <V>
 */
public interface Map<K, V> {
    void add(K key, V value);
    V remove(K key);
    boolean contanins(K key);
    V get(K key);
    void set(K key, V newvalue);
    int getSize();
    boolean isEmpty();
}
