import java.util.*;
class vowels {
    public static void main(String[] args) {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        a = s.next();
        String b = "";
        b = a.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Modified string is" + b);

    }
}
