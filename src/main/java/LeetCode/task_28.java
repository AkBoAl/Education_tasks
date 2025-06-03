package LeetCode;

public class task_28 {
    public static void main(String[] args) {
        String str1 = "mississippi";
        String str2 = "issip";
        System.out.println(strStr(str1, str2));
    }

    public static int strStr(String haystack, String needle) {
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j >= needle.length()) {
                    return i - needle.length() + 1;
                }
            } else {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }
}
