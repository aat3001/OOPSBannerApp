
/**
 * Write a description of class OOPSUC5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OOPSUC5
{

    public static void main(String[] args) {

        String[] lines = {

            String.join("  ", " *** ", " *** ", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", " ****")

        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

}