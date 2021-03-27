package simple;
import java.util.*;
//A program to find day of a given date

public class Operate
{
static int dayofweek(int d, int m, int y)
{
	int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
	y -= (m < 3) ? 1 : 0;
	return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
}

//Driver Program to test above function
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int date,month,year;
	System.out.print("Enter date : ");
	date=sc.nextInt();
	System.out.print("Enter month number : ");
	month=sc.nextInt();
	System.out.print("Enter year number : ");
	year=sc.nextInt();
	int day = dayofweek(date,month,year);
	switch(day)
    {
        case 1:
            System.out.println("Today is Monday");
        case 2:
            System.out.println("Today is Tuesday");
        case 3:
            System.out.println("Today is Wednesday");
        case 4:
            System.out.println("Today is Thursday");
        case 5:
            System.out.println("Today is Friday");
        case 6:
            System.out.println("Today is Saturday");
            break;
        default:
        	System.out.println("Today is Sunday");
            break;
    }
}
}

//This code is contributed
//by Anant Agarwal.
