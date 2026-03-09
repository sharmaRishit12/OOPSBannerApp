import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  ****   ",
                " **  **  ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                " **  **  ",
                "  ****   "
        });

        patternMap.put('P', new String[]{
                " *****   ",
                " **   ** ",
                " **   ** ",
                " *****   ",
                " **      ",
                " **      ",
                " **      "
        });

        patternMap.put('S', new String[]{
                "  ***** ",
                " **     ",
                " **     ",
                "  ***** ",
                "      **",
                " **   **",
                "  ***** "
        });

        renderBanner("OOPS", patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int rows = patternMap.get('O').length;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c)[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}