package com.example.ood;

public class date {
    private int day;
    private int month;
    private int year;
    public date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    public void resetDate(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    public int getYear()
    {
        return year;
    }
    public String getAsString ()
    {
        return as2Digits(day) + "/" + as2Digits(month) + year;
    }

    private String as2Digits(int i) {
        if(i< 10)
        {
            return "0"+ i;
        }
        else {
            return ""+ i;
        }
    }

}
