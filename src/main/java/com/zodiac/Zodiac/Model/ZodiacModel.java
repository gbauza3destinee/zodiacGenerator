package com.zodiac.Zodiac.Model;

public class ZodiacModel {

    public String elemental;
    public String description;
    public String sign;

    public String startDate;
    public String endDate;

    public ZodiacModel() {

    }

    public ZodiacModel(String elemental, String description, String sign, String startDate,
                       String endDate){
        this.elemental = elemental;
        this.description = description;
        this.sign = sign;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getElemental() {
        return elemental;
    }

    public void setElemental(String elemental) {
        this.elemental = elemental;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
