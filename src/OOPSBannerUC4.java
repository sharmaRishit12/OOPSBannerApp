public class OOPSBannerUC4 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String[] banner = {

                String.join(" ",
                        "  ****   ",
                        "  ****   ",
                        " *****   ",
                        "  ***** "
                ),

                String.join(" ",
                        " **  **  ",
                        " **  **  ",
                        " **   ** ",
                        " **     "
                ),

                String.join(" ",
                        "**    ** ",
                        "**    ** ",
                        " **   ** ",
                        " **     "
                ),

                String.join(" ",
                        "**    ** ",
                        "**    ** ",
                        " *****   ",
                        "  ***** "
                ),

                String.join(" ",
                        "**    ** ",
                        "**    ** ",
                        " **      ",
                        "      **"
                ),

                String.join(" ",
                        " **  **  ",
                        " **  **  ",
                        " **      ",
                        " **   **"
                ),

                String.join(" ",
                        "  ****   ",
                        "  ****   ",
                        " **      ",
                        "  ***** "
                )
        };

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}