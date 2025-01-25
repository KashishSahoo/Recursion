import java.util.ArrayList;

public class a17_phone {
    public static void main(String[] args) {
        // int ans = phoneCount("", "12");
        // System.out.println(ans);
    }

    static void phone(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phone(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> phoneRet(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> ansBelowCalls = phoneRet(p + ch, up.substring(1));
            list.addAll(ansBelowCalls);

        }
        return list;
    }
    static int phoneCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count=count+phoneCount(p + ch, up.substring(1));
        }
        return count;
    }

}
