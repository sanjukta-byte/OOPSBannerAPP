/**
 * OOPSBannerApp
 *
 * UC3: Refactored banner creation using String.join()
 * to improve memory efficiency and readability.
 *
 * @author Sanjukta
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
System.out.println(String.join(" ",
                "  ***** ", "   ***** ", " ******** ", "  ***** "));

        System.out.println(String.join(" ",
                "**     **", "**     **", "**     **", "**     **"));

        System.out.println(String.join(" ",
                "**     **", "**     **", "**     **", "**"));

        System.out.println(String.join(" ",
                "**     **", "**     **", "******** ", "   **** "));

        System.out.println(String.join(" ",
                "**     **", "**     **", "**       ", "      **"));

        System.out.println(String.join(" ",
                "**     **", "**     **", "**       ", "**     **"));

        System.out.println(String.join(" ",
                "  ***** ", "   ***** ", " **      ", "   ***** "));
    }
}