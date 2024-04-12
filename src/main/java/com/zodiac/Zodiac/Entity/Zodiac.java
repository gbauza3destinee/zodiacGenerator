package com.zodiac.Zodiac.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Zodiacs")
public class Zodiac {

    // every table must give column name
    // Private Access Modifiers because we should not be accessing the variables directly, we should only get value by setting.
    @Id
    @Column(name="zodiacname")
    private String name;

    @Column(name="elemental")
    private String elemental;

    @Column(name="description")
    private String description;

    @Column(name="startdate")
    private String startDate;

    @Column(name="enddate")
    private String endDate;

    public Zodiac(){
        this.elemental = elemental;
        this.description = description;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return String.format("Zodiac: %s , Elemental: %s , Description : %s" , name, elemental, description);
    }
}
