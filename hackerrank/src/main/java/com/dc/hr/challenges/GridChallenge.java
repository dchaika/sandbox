package com.dc.hr.challenges;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    /*
     * Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending.
     * Determine if the columns are also in ascending alphabetical order, top to bottom.
     * Return YES if they are or NO if they are not.
     *
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        char[][] gridArr = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < grid.size(); i++) {
            char[] letters = grid.get(i).toCharArray();
            Arrays.sort(letters);
            gridArr[i] = letters;
        }

        for (int j = 0; j < gridArr[0].length; j++) {
            char prevValue = 'a';
            for (char[] chars : gridArr) {
                if (chars[j] >= prevValue) {
                    prevValue = chars[j];
                    continue;
                }
                return "NO";
            }
        }
        return "YES";
    }
}