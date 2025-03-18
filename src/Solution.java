import java.util.Arrays;

class Solution{

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