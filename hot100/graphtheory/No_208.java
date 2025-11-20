package hot100.graphtheory;

import java.util.HashSet;
import java.util.Set;

public class No_208 {
    class Trie {
        Set<String> set = new HashSet<>();
        public Trie() {

        }

        public void insert(String word) {
            set.add(word);
        }

        public boolean search(String word) {
            return set.contains(word);
        }

        public boolean startsWith(String prefix) {
            for (String word : set) {
                if (word.length() < prefix.length()) {
                    continue;
                }
                if (word.substring(0, prefix.length()).equals(prefix)) {
                    return true;
                }
            }
            return false;
        }
    }
}

