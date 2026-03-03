public class OOPSUC7 {

   
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create CharacterPatternMap array for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),

            new CharacterPatternMap('P', new String[] {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),

            new CharacterPatternMap('S', new String[] {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            }),

            new CharacterPatternMap(' ', new String[] {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
            })
        };
    }

    /**
     * Get ASCII pattern for given character
     */
    public static String[] getCharacterPattern(char ch,
                                              CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // default to space if not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Print message as ASCII banner
     */
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            for (int col = 0; col < message.length(); col++) {

                char ch = message.charAt(col);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[row] + "   ");
            }

            System.out.println();
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}