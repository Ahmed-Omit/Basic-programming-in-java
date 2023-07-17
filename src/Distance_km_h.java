
import  java.util.*;
public class Distance_km_h
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float distance,time, speed;
        System.out.print(" Enter the passing  distance : " );
        distance = s.nextFloat();
        System.out.print(" Enter the passing time : " );
        time = s.nextFloat();
        speed =( (distance/time) * 60);
        System.out.print(" Speed in km/h : " + speed + " fit");

    }


}



