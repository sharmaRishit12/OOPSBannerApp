public class OOPSBannerUC7 {

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

    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                "  ****   ",
                " **  **  ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                " **  **  ",
                "  ****   "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                " *****   ",
                " **   ** ",
                " **   ** ",
                " *****   ",
                " **      ",
                " **      ",
                " **      "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                "  ***** ",
                " **     ",
                " **     ",
                "  ***** ",
                "      **",
                " **   **",
                "  ***** "
        });

        CharacterPatternMap[] word = {o, o, p, s};

        int rows = o.getPattern().length;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }
}