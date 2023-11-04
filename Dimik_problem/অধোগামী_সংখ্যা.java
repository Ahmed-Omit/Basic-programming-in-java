public class অধোগামী_সংখ্যা
{
    public static void main(String[] args)
    {
        int count = 0;

        for (int i = 100; i >= 1; i--)
        {
            System.out.print(i + "\t");
            count++;


           if (count == 5)
           {
               System.out.println();
               count = 0;
           }


        }
    }
}