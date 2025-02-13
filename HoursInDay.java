//Write a program that calculate hours in a day. Your program should use an interface with two methods and your class should implement the interface.

public class HoursInDay extends HoursInDayInterface
{

    public static int TimeMovement()
   {
    //movement of time start from 12 am
    int start = 12;
    int hourCount = 0;
    int hourTotal = 0;
    for(int i = 0; i < 24; i++)
    {
        start++;
        if(start == 13)
        {
            start = 1;
        }
        hourCount = HourCount();
        hourTotal += hourCount;
    }
    return(hourTotal);
   } 
   public static  int HourCount()
   {
    //keep track of  hours
    int hours = 0;
    hours += 1;
    return hours;   
   }

}

public interface HoursInDayInterface
{
    //interface
    int TimeMovement();
    int HourCount();
}