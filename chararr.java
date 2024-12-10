import java.util.*;
class main
{
    public static void main(String args[])
    {
        String a="AMARAN";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
    }
}