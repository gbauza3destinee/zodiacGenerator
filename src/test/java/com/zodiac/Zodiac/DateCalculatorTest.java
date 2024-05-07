package com.zodiac.Zodiac;


import com.zodiac.Zodiac.Entity.Zodiac;
import com.zodiac.Zodiac.Exception.ZodiacNotFoundException;
import com.zodiac.Zodiac.Model.MonthlyZodiacModel;
import com.zodiac.Zodiac.Repository.ZodiacRepository;
import com.zodiac.Zodiac.Service.DateCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

public class DateCalculatorTest {

    @Mock
    private ZodiacRepository zodiacRepository;
    @InjectMocks
    private DateCalculator dateCalculator;


    private ArrayList<Zodiac> zodiacList = new ArrayList<Zodiac>();

    private static Map<Integer, java.util.List<MonthlyZodiacModel>> monthMap = new HashMap<>();

    // Cases
    @BeforeEach
    void setUp(){
        // Set up ZodiacList
        Zodiac aries = new Zodiac();
        zodiacList.add(aries);
        Zodiac taurus = new Zodiac();
        zodiacList.add(taurus);
        Zodiac gemini = new Zodiac();
        zodiacList.add(gemini);
        Zodiac cancer = new Zodiac();
        zodiacList.add(cancer);
        Zodiac leo = new Zodiac();
        zodiacList.add(leo);
        Zodiac virgo = new Zodiac();
        zodiacList.add(virgo);
        Zodiac libra = new Zodiac();
        zodiacList.add(libra);
        Zodiac scorpio = new Zodiac();
        zodiacList.add(scorpio);
        Zodiac sagittarius = new Zodiac();
        zodiacList.add(sagittarius);
        Zodiac capricorn = new Zodiac();
        zodiacList.add(capricorn);
        Zodiac aquarius = new Zodiac();
        zodiacList.add(aquarius);
        Zodiac pisces = new Zodiac();
        zodiacList.add(pisces);

        // Set Up HashMap

        MonthlyZodiacModel janZodiac1 = new MonthlyZodiacModel(1,19 , 1, capricorn);
        MonthlyZodiacModel janZodiac2 = new MonthlyZodiacModel(20, 31,1, aquarius);
        ArrayList<MonthlyZodiacModel> janZodiacs = new ArrayList<>();
        janZodiacs.add(janZodiac1);
        janZodiacs.add(janZodiac2);
        monthMap.put(1,janZodiacs);

        MonthlyZodiacModel febZodiac1 = new MonthlyZodiacModel(1, 18, 2, aquarius);
        MonthlyZodiacModel febZodiac2 = new MonthlyZodiacModel(19, 29, 2, pisces);
        ArrayList<MonthlyZodiacModel> febZodiacs = new ArrayList<>();
        febZodiacs.add(febZodiac1);
        febZodiacs.add(febZodiac2);
        monthMap.put(2, febZodiacs);

        MonthlyZodiacModel marZodiac1 = new MonthlyZodiacModel(1,20,03,pisces);
        MonthlyZodiacModel marZodiac2 = new MonthlyZodiacModel(21,31, 03, aries);
        ArrayList<MonthlyZodiacModel> marZodiacs = new ArrayList<>();
        marZodiacs.add(marZodiac1);
        marZodiacs.add(marZodiac2);
        monthMap.put(3, marZodiacs);

        MonthlyZodiacModel aprilZodiac1 = new MonthlyZodiacModel(1,19,04, aries);
        MonthlyZodiacModel aprilZodiac2 = new MonthlyZodiacModel(20, 30, 4, taurus);
        ArrayList<MonthlyZodiacModel> aprilZodiacs = new ArrayList<>();
        aprilZodiacs.add(aprilZodiac1);
        aprilZodiacs.add(aprilZodiac2);
        monthMap.put(4, aprilZodiacs);

        MonthlyZodiacModel mayZodiac1 = new MonthlyZodiacModel(1,20,05,taurus);
        MonthlyZodiacModel mayZodiac2 = new MonthlyZodiacModel(21, 31, 5, gemini);
        ArrayList<MonthlyZodiacModel> mayZodiacs = new ArrayList<>();
        mayZodiacs.add(mayZodiac1);
        mayZodiacs.add(mayZodiac2);
        monthMap.put(5, mayZodiacs);

        MonthlyZodiacModel juneZodiac1 = new MonthlyZodiacModel(1,20,6, gemini);
        MonthlyZodiacModel juneZodiac2 = new MonthlyZodiacModel(21, 30, 6, cancer);
        ArrayList<MonthlyZodiacModel> juneZodiacs = new ArrayList<>();
        juneZodiacs.add(juneZodiac1);
        juneZodiacs.add(juneZodiac2);
        monthMap.put(6, juneZodiacs);

        MonthlyZodiacModel julyZodiac1 = new MonthlyZodiacModel(1,22,7, cancer);
        MonthlyZodiacModel julyZodiac2 = new MonthlyZodiacModel(23,31, 7, leo);
        ArrayList<MonthlyZodiacModel> julyZodiacs = new ArrayList<>();
        julyZodiacs.add(julyZodiac1);
        julyZodiacs.add(julyZodiac2);
        monthMap.put(7, julyZodiacs);

        MonthlyZodiacModel augZodiac1 = new MonthlyZodiacModel(1,22, 8, leo);
        MonthlyZodiacModel augZodiac2 = new MonthlyZodiacModel(23, 31, 8, virgo);
        ArrayList<MonthlyZodiacModel> augZodiacs = new ArrayList<>();
        augZodiacs.add(augZodiac1);
        augZodiacs.add(augZodiac2);
        monthMap.put(8, augZodiacs);

        MonthlyZodiacModel septZodiac1 = new MonthlyZodiacModel(1, 22, 9, virgo);
        MonthlyZodiacModel septZodiac2 = new MonthlyZodiacModel(23, 30, 9, libra);
        ArrayList<MonthlyZodiacModel> septZodiacs = new ArrayList<>();
        septZodiacs.add(septZodiac1);
        septZodiacs.add(septZodiac2);
        monthMap.put(9, septZodiacs);

        MonthlyZodiacModel octZodiac1 = new MonthlyZodiacModel(1, 22, 10, libra);
        MonthlyZodiacModel octZodiac2 = new MonthlyZodiacModel(23, 31, 10, scorpio);
        ArrayList<MonthlyZodiacModel> octZodiacs = new ArrayList<>();
        octZodiacs.add(octZodiac1);
        octZodiacs.add(octZodiac2);
        monthMap.put(10, octZodiacs);

        MonthlyZodiacModel novZodiac1 = new MonthlyZodiacModel(1, 21, 11, scorpio);
        MonthlyZodiacModel novZodiac2 = new MonthlyZodiacModel(22, 31, 11, sagittarius);
        ArrayList<MonthlyZodiacModel> novZodiacs = new ArrayList<>();
        novZodiacs.add(novZodiac1);
        novZodiacs.add(novZodiac2);
        monthMap.put(11, novZodiacs);

        MonthlyZodiacModel decZodiac1 = new MonthlyZodiacModel(1, 21, 12, sagittarius);
        MonthlyZodiacModel decZodiac2 = new MonthlyZodiacModel(22, 31, 12, capricorn);
        ArrayList<MonthlyZodiacModel> decZodiacs = new ArrayList<>();
        decZodiacs.add(decZodiac1);
        decZodiacs.add(decZodiac2);
        monthMap.put(12, decZodiacs);



    }


    /**
     * This method populates the list of zodiacs,
     * and then populates the hashmap completely
     */
    @Test
    public void populateMonthlyZodiac_returnsAll12Signs_populatesHashMap(){
        // 1. GIVEN

        when(zodiacRepository.findAll()).thenReturn(zodiacList);

        dateCalculator.populateMonthlyZodiac();


        // WHEN testing how many zodiac signs are populated, should be 12


        // 2. THEN Verify populated all Zodiac Signs

            Assertions.assertEquals(monthMap.keySet().size(),12);


    }


    @Test
    public void findZodiacSign_withBirthAndDay_returnsCorrectZodiacSign(){
        int month = 1;
        int day = 20;
        Zodiac expected = new Zodiac();
        expected.setName("aquarius");

        Zodiac actualResult = dateCalculator.findZodiacSign(month,day);


        Assertions.assertEquals(expected, actualResult);


    }

    @Test
    public void findZodiacSign_withValidBirthAndDay_throwsZodiacNotFoundException(){
        int month = 1;
        int day = 20;
        Zodiac expected = new Zodiac();
        Zodiac actualResult = dateCalculator.findZodiacSign(month,day);

        Assertions.assertNotEquals(expected, actualResult);


    }

    @Test
    public void findZodiacSign_withInvalidBirthAndDay_throwsZodiacNotFoundException(){
        int month = 21;
        int day = 40;
        when(dateCalculator.findZodiacSign(month, day)).thenThrow( new ZodiacNotFoundException("Invalid input"));
        Zodiac actualResult = dateCalculator.findZodiacSign(month,day);

      Assertions.assertNull(actualResult);

    }
}
