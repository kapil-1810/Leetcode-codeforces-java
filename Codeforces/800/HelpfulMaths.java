import java.util.*;

public class HelpfulMaths {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = new char[(s.length() + 1) / 2];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '+') {
                arr[index++] = s.charAt(i);
            }
        }

        Arrays.sort(arr);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            ans.append(arr[i]);

            if (i != arr.length - 1) {
                ans.append("+");
            }
        }

        System.out.println(ans);

        sc.close();
    }
}