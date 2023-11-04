import java.util.Scanner;

public class StringArray
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.print(" Enter the string : ");
        String v=s.nextLine();
        v=v.toLowerCase();
       char array[] = v.toCharArray();



       int count[]=new int[26];

       for(int i=0;i<v.length();i++)
       {
           char litter = array[i];
           if( Character.isLetter(litter))
           {
               int index = litter - 'a';
               count[index]++;
           }
       }
       System.out.println(" Litter count : " );
       for (int i = 0;i<count.length;i++)
       {
           if ( count[i] !=0)
           {
               char litter = ( char) (i +'a');
               System.out.println(litter + " : " + count[i]);
           }
       }
    }
}