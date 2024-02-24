import java.time.LocalDate;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        set(day, month, year);
    }

    public MyDate(int day, String monthName, int year)
    {
        this.day = day;
        this.month = MyDate.convertToMonthNumber(monthName);
        this.year = year;
    }

    public MyDate()
    {
        LocalDate today = LocalDate.now();
        set(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }

    public MyDate copy ()
    {
        MyDate other = new MyDate(day, month, year);
        return other;
    }

    public void set(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear()
    {
        return this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0);

    }

    public String getMonthName()
    {
        switch (month)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "November";
            case 11:
                return "October";
            case 12:
                return "December";
            default:
                return null;
        }
    }

    public void stepForwardOneDay()
    {
        day++;
        if (this.day > this.numberOfDaysInMonth())
        {
            day = 1;
            month++;
            if (month > 12)
            {
                month = 1;
                year++;
            }
        }
    }

    public void stepForward(int days)
    {

        for(int i =0; i<days; i++)
        {
            this.stepForwardOneDay();
        }

    }


    public int numberOfDaysInMonth()
    {
            switch (month)
            {
                case 2:
                    if (isLeapYear())
                    {
                        return 29;
                    }
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
    }


    public int yearsBetween(MyDate other)
    {
        int years = 0;
        if (isBefore(other))
        {
            years = other.year - this.year;
            if (this.month > other.month || (this.month == other.month
                    && this.day > other.day))
            {
                years--;
            }
        }
        else
        {
            years = this.year - other.year;
            if (other.month > this.month || (other.month == this.month
                    && other.day > this.day))
            {
                years--;
            }
        }
        return years;
    }

    public boolean isBefore(MyDate other)
    {
        if (this.year < other.year)
        {
            return true;
        }
        if (this.year > other.year)
        {
            return false;
        }
        if (this.month < other.month)
        {
            return true;
        }
        if (this.month > other.month)
        {
            return false;
        }
        return this.day < other.day;
    }


    public String toString()
    {
        String s = "";
        if (day<10)
        {
            s += "0";
        }
        s += day;
        s += "/";
        if (month <10)
        {
            s += "0";
        }
        s += month;
        s += "/" + year;

        return s;
    }

    public static int convertToMonthNumber (String monthName)
    {
        switch(monthName)
        {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                return 1;
        }
    }

}
