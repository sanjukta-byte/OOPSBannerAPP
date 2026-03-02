/**
 * OOPSBannerApp
 *
 * UC8: Hashmap pattern refactor.
 * Demonstrates efficiency, improved storage, and scalability.
 *
 * @author Sanjukta
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class for Character Pattern
    static class CharacterPattern {
        private String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to initialize pattern map
    private static Map<Character, CharacterPattern> initializePatterns() {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern(new String[]{
                "  *****  ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "  *****  "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
                "******** ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        }));

        patternMap.put('S', new CharacterPattern(new String[]{
                "  *****  ",
                "**     **",
                "**",
                "   ****  ",
                "      **",
                "**     **",
                "  *****  "
        }));

        return patternMap;
    }

    // Method to build banner
    private static String[] buildBanner(String word, Map<Character, CharacterPattern> patternMap) {

        int height = 7;
        String[] banner = new String[height];

        for (int i = 0; i < height; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern pattern = patternMap.get(ch);
                if (pattern != null) {
                    lineBuilder.append(pattern.getPattern()[i]).append(" ");
                }
            }

            banner[i] = lineBuilder.toString();
        }

        return banner;
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = initializePatterns();

        String word = "OOPS";

        String[] banner = buildBanner(word, patternMap);

        // Render banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}