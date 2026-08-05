import java.util.*;

public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            if (s.length() <= 10) {
                System.out.println(s);
            } else {

                char first = s.charAt(0);
                char last = s.charAt(s.length() - 1);
                int middle = s.length() - 2;

                System.out.println("" + first + middle + last);
            }
        }

        sc.close();
    }
}