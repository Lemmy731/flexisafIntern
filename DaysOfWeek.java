//java program that displays days of the week using enum to capture days use super and sub class

//superclass
public class DaysOfWeek
{
    //fields
    public Day day1;
    public Day day2;
    public Day day3;
    public Day day4;
    public Day day5;
    public Day day6;
    public Day day7;

    //constructor
    public DaysOfWeek()
    {
        //initialize fields
        day1 = Day.Monday;
        day2 = Day.Tuesday;
        day3 = Day.Wednesday;
        day4 = Day.Thursday;
        day5 = Day.Friday;
        day6 = Day.Saturday;
        day7 = Day.Sunday;
    }
}

//enum for constant
 public enum Day
   {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
   }


// subclass
public class DaysOfWeekSubClass extends DaysOfWeek
{
    //function that display days of the week

   public void DisplayDays()
   {
    DaysOfWeekSubClass child = new DaysOfWeekSubClass();

    //print days
    Day firstDay = child.day1;
    System.out.print(firstDay);
    Day secondDay = child.day2;
    System.out.print(secondDayDay);
    Day thirdDay = child.day3;
    System.out.print(thirdDay);
    Day fourthDay = child.day4;
    System.out.print(fourthDay);
    Day fifthDay = child.day5;
    System.out.print(fifthDay);
    Day sixthDay = child.day6;
    System.out.print(sixthDay);
    Day seventhDay = child.day7;
    System.out.print(seventhDayDay);
   }
}