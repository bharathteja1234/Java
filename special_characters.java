import java.util.Scanner;



class special_characters

{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s1;

        int len, sp_count=0,alp_count=0,digi_count=0,n_count=0;

        System.out.print("Enter the text: ");

        s1=sc.nextLine();

        len=s1.length();

        char[] ch=s1.toCharArray();

        for(int i=0;i<len;i++){

            if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')){

                alp_count++;

            }

            else if(ch[i]>='0'&&ch[i]<='9') {

                digi_count++;

            }

            else



            {

                System.out.print(ch[i]);

                sp_count++;

            }

        }

        System.out.println();

        System.out.println("total special character: "+sp_count);

    }

} 
