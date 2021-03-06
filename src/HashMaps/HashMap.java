package HashMaps;

public class HashMap {

    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value){
        int arrayIndex = this.hash(key);
        this.hashmap[arrayIndex] = value;
    }

    public String retrieve(String key){
        int arrayIndex = this.hash(key);
        return this.hashmap[arrayIndex];
    }
}
