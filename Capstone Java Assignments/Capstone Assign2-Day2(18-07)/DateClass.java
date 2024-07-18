class Date {

    private int day;

    private int month;

    private int year;



    public Date(int day, int month, int year) {

        this.day = day;

        this.month = month;

        this.year = year;

    }



    public int getDay() {

        return day;

    }



    public void setDay(int day) {

        this.day = day;

    }



    public int getMonth() {

        return month;

    }



    public void setMonth(int month) {

        this.month = month;

    }



    public int getYear() {

        return year;

    }



    public void setYear(int year) {

this.year = year;

}

public void displayDate() {

System.out.println(day + "/" + month + "/" + year);

}

}



public class DateClass {

    public static void main(String[] args) {


        Date date = new Date(12, 7, 2024);

        System.out.println("Date: ");

        date.displayDate();

        date.setDay(22);

        date.setMonth(9);

        date.setYear(2024);

        System.out.println("Updated Date: ");

        date.displayDate();

    }

}



