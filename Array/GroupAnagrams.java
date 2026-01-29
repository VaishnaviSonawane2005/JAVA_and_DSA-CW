package Array;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {

            // Convert word into character array
            char[] ch = word.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Sorted string becomes the key
            String key = new String(ch);

            // Create list if key doesn't exist and add the word

            //groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(word);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {

        String[] words = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(words));
    }
}
