import java.util.Arrays;

class Solution{

    /**
     * Clase con metodos que trabajan con strings
     * @method public static String toCamelCase(String str) {}
     *
     * @examples "the-stealth-warrior" gets converted to "theStealthWarrior"
     *
     * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     *
     * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
     *
     */

    public Solution() {}

    public static String toCamelCase(String str){

        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("[-_]");
        StringBuilder camelCaseString = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            camelCaseString.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1));
        }

        return camelCaseString.toString();
    }
}