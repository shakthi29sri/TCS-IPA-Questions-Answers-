Example :

I/P: Rhino1Ceros5

O/P:
Number of vowels: 4
Number of consonants: 6
Number of digits: 2


Code:

import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.toLowerCase();
        int vow =0;
        int cons =0;
        int num =0;
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    vow++;
                }
                else
                {
                    cons++;
                }
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                num++;
            }
        }
        System.out.println("Number of vowels: "+vow);
        System.out.println("Number of consonants: "+cons);
        System.out.println("Number of digits: "+num);
    }
    
}
