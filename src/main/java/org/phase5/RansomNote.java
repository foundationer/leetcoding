package org.phase5;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char magazineChar : magazineChars) {
            magazineMap.put(magazineChar, magazineMap.getOrDefault(magazineChar, 0) + 1);
        }
        char[] noteChars = ransomNote.toCharArray();
        for (char noteChar : noteChars) {
            magazineMap.put(noteChar, magazineMap.getOrDefault(noteChar, 0) - 1);
        }
        return magazineMap.values()
                .stream()
                .allMatch(i -> i >= 0);
    }
}
