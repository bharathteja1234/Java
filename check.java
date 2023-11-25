import java.util.*;
class check {
    public static void main(String[] args) {
        String s1,s2;
        boolean result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter username");
        s1=s.next();
        System.out.println("Reenter username");
        s2=s.next();
        result=s1.equals(s2);
        if(result==true)
            System.out.println("Accepted");
        else
            System.out.println("Rejected");
    }
}
