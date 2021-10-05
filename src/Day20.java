class Age
{
   private int days;
   private int months;
   private int years;
 
   private Age()
   {
      //Prevent default constructor
   }
 
   public Age(int days, int months, int years)
   {
      this.days = days;
      this.months = months;
      this.years = years;
   }
 
   public int getDays()
   {
      return this.days;
   }
 
   public int getMonths()
   {
      return this.months;
   }
 
   public int getYears()
   {
      return this.years;
   }
 
   @Override
   public String toString()
   {
      return years + " Years, " + months + " Months, " + days + " Days";
   }
} Home / Java / Java – Calculate age from date of birth
Java – Calculate age from date of birth
Last Modified: December 26, 2020

To calculate age from date of birth for any person seems a really simple thing to do and it is indeed. In a very broad sense, I can visualize three solutions for this age calculator program.

Table of Contents

1. Java 8 Period class [Best]
2. Jodatime library [Good]
3. Date and Calendar classes [Basic]

1. Java 8 Period class
Java 8 program to calculate age of a person from date of birth. It uses Period class to store the differences between two LocalDate instances. The two dates are todays date and date of birth.

Once Period class is created, we can get the difference between both dates in desired metrics.

Calculate age in Java 8
LocalDate today = LocalDate.now();                          //Today's date
LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);  //Birth date
 
Period p = Period.between(birthday, today);
 
//Now access the values as below
System.out.println(period.getDays());
System.out.println(period.getMonths());
System.out.println(period.getYears());

2. Jodatime library
We know that new Java 8 date time API is inspired from Joda library. Joda also has Period class which is very much similar to Java 8 Period class.

So this solution also very similar to Java 8 solution.

Calculate age with Joda
LocalDate birthdate = new LocalDate (1970, 1, 20);      //Birth date
LocalDate now = new LocalDate();                        //Today's date
 
Period period = new Period(birthdate, now, PeriodType.yearMonthDay());
 
//Now access the values as below
System.out.println(period.getDays());
System.out.println(period.getMonths());
System.out.println(period.getYears());
Only difference between above two examples is method “between” which is not available in Period class in Joda library. In Java 8, Period class is used to define an amount of time with date-based values (years, months, days).


3. Calculate age with date and calendar
This solution is very basic and should be used for only learning the logic of calculation. I will not recommend this method for production class software. Though it works fine but code does not look very readable and performance (not measured accurately) can be also a downside.

I have made some effort by adding Age class to make this solution look professional. 😉

I have made default constructor private and provided a constructor which accept days, months , years. We can add parameter validation as well so that it does not accept negative values.

Age.java
class Age
{
   private int days;
   private int months;
   private int years;
 
   private Age()
   {
      //Prevent default constructor
   }
 
   public Age(int days, int months, int years)
   {
      this.days = days;
      this.months = months;
      this.years = years;
   }
 
   public int getDays()
   {
      return this.days;
   }
 
   public int getMonths()
   {
      return this.months;
   }
 
   public int getYears()
   {
      return this.years;
   }
 
   @Override
   public String toString()
   {
      return years + " Years, " + months + " Months, " + days + " Days";
   }
}
Second class is AgeCalculator itself which has a private method which accept a person’s date of birth and return the Age instance having person’s age information.

AgeCalculator.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class AgeCalculator
{
   private static Age calculateAge(Date birthDate)
   {
      int years = 0;
      int months = 0;
      int days = 0;
 
      //create calendar object for birth day
      Calendar birthDay = Calendar.getInstance();
      birthDay.setTimeInMillis(birthDate.getTime());
 
      //create calendar object for current day
      long currentTime = System.currentTimeMillis();
      Calendar now = Calendar.getInstance();
      now.setTimeInMillis(currentTime);
 
      //Get difference between years
      years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
      int currMonth = now.get(Calendar.MONTH) + 1;
      int birthMonth = birthDay.get(Calendar.MONTH) + 1;
 
      //Get difference between months
      months = currMonth - birthMonth;
 
      //if month difference is in negative then reduce years by one 
      //and calculate the number of months.
      if (months < 0)
      {
         years--;
         months = 12 - birthMonth + currMonth;
         if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
            months--;
      } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      {
         years--;
         months = 11;
      }
 
      //Calculate the days
      if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
         days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
      else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      {
         int today = now.get(Calendar.DAY_OF_MONTH);
         now.add(Calendar.MONTH, -1);
         days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
      } 
      else
      {
         days = 0;
         if (months == 12)
         {
            years++;
            months = 0;
         }
      }
      //Create new Age object 
      return new Age(days, months, years);
   }
 
   public static void main(String[] args) throws ParseException
   {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date birthDate = sdf.parse("29/11/1981");     
      Age age = calculateAge(birthDate);
      System.out.println(age);
   }
}
