import java.util.*;
class main
{
    public static void main(String args[])
    {
        String a="UDAYANIEEE";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
        int count=0;
        int max=0;
        for(int i=0;i<26;i++)
        {
            if(c[i]>count)
        {
            count=c[i];
            max=i;
        }
        }
        System.out.println((char)(max+65));
    }
       
}