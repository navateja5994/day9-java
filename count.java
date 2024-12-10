import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int vowel = 0;
        int consonant = 0;
        int number = 0;
        int special = 0;
        for (int i = 0; i < a.length(); i++)
        {
            char c=a.charAt(i);
            if (Character.isDigit(c))
            {
                number++;
            }
            else if (Character.isLetter(c))
            {
                if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                    vowel++;
                }
                else
                {
                    consonant++;
                }
            } 
            else 
            {
                special++;
            }
        }
        
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Numbers: " + number);
        System.out.println("Special Characters: " + special);
    }
}