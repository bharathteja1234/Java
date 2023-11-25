import java.util.*;
class vote{
    public static void main(String[] args){
        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age");
        age=s.nextInt();
        if(age>18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible.No.of years left:"+(18-age));
    }
}
