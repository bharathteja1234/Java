import  java.util.*;
class fibonacci{
    public static void main(String[] args){
        int i,y,n=0,m=1,x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of fibonacci numbers to be printed");
        y=s.nextInt();
        System.out.println("Fibonacci series");
        for(i=0;i<y;i++)
        {
            System.out.println(+n);
            x=n+m;
            n=m;
            m=x;
        }

    }
}
