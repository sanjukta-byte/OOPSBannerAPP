/**
 * OOPSBannerApp
 *
 * UC6: Banner generated using static helper methods.
 * Applies modular programming and DRY principle.
 *
 * @author Sanjukta
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o1 = buildO();
        String[] o2 = buildO();
        String[] p  = buildP();
        String[] s  = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    o1[i],
                    o2[i],
                    p[i],
                    s[i]
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Letter O
    public static String[] buildO() {
        return new String[]{
                "  *****  ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "  *****  "
        };
    }

    // Letter P
    public static String[] buildP() {
        return new String[]{
                "******** ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**      "
        };
    }

    // Letter S
    public static String[] buildS() {
        return new String[]{
                "  ***** ",
                "**     **",
                "**",
                "   **** ",
                "      **",
                "**     **",
                "   ***** "
        };
    }
}