import java.util.*;
public class Switch {
    public static void main(String[]args)
    {
        Scanner s =new Scanner(System.in);
        System.out.print(" Score :");
        int score =s.nextInt();
        String grade = "";
        switch(score/10)
        {
            case 9:
                grade="A+";
                break;
            case 8:
                grade="A";
                break;
            case 7:
                grade="b";
                break;
            case 6:
                grade="c";
                break;
            case 5:
                grade="d";
                break;
            case 4&3&2&1:
                grade="";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("Grade :" + grade);
    }

}



