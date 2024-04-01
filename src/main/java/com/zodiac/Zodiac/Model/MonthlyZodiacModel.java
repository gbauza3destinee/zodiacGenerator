package com.zodiac.Zodiac.Model;
import com.zodiac.Zodiac.Entity.Zodiac;


// API Facing
public class MonthlyZodiacModel {

    public int startDay;
    public int endDay;
    public int month;
    public Zodiac zodiac;

    public MonthlyZodiacModel(){

    }

    public MonthlyZodiacModel(int startDay, int endDay, int month, Zodiac zodiac){
        this.startDay = startDay;
        this.endDay = endDay;
        this.month = month;
        this.zodiac  = zodiac;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Zodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }
}
