/**
 * OOPSBannerApp
 *
 * UC4: Banner stored in String array and printed using loop.
 * Improves modularity, maintainability and reusability.
 *
 * @author Sanjukta
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
			
        "  *****     *****   ********    ***** ",
        "**     ** **     ** **     ** **     **",
        "**     ** **     ** **     ** **      ",
        "**     ** **     ** ********     **** ",
        "**     ** **     ** **              ** ",
        "**     ** **     ** **        **     **",
        "  *****     *****   **          ***** "
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
