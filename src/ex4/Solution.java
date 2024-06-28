package ex4;

public class Solution {

    public boolean backspaceCompare(String s, String t) {

        while (true) {
            s = remove(s);

            t = remove(t);


            if (s.equals(t)) {
                return true;
            }

            if (!t.contains("#") || !s.contains("#")) {
                return false;
            }
        }
    }

    private String remove(String s) {
        int index = s.indexOf("##");
        if (index > 0 && index + 3 <= s.length()) {
            String ss = s.substring(index - 1, index + 3);
            System.out.println(ss);
            s = s.replace(ss, "");
        }

        int index2 = s.indexOf("#");

        if (index2 > 0) {
            String temp2 = s.substring(index2 - 1, index2 + 1);
            s = s.replace(temp2, "");
        }

        if (index2 == 0) {
            String temp2 = s.substring(index2, index2 + 2);
            s = s.replace(temp2, "");
        }

        return s;
    }
}
