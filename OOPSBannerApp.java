/**
 * OOPSBannerApp
 *
 * UC7: Banner generated using CharacterPattern class.
 * Demonstrates encapsulation, abstraction, and scalability.
 *
 * @author Sanjukta
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class for Character Pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Character pattern storage
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "  *****  ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "  *****  "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "******** ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                "  *****  ",
                "**     **",
                "**",
                "   **** ",
                "      **",
                "**     **",
                "  ***** "
        }));

        String word = "OOPS";
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                lineBuilder.append(patternMap.get(ch).getPattern()[i]).append(" ");
            }

            banner[i] = lineBuilder.toString();
        }

        // Render banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}