package com.zodiac.Zodiac.Service;
import com.zodiac.Zodiac.Entity.Zodiac;
import com.zodiac.Zodiac.Exception.ZodiacNotFoundException;
import com.zodiac.Zodiac.Model.MonthlyZodiacModel;
import com.zodiac.Zodiac.Repository.ZodiacRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * * Program starts -> fetch from database  -> populate hashmap -> user request enters -> hashmap fetched
 *    Load list of zodiacs from database. Then populate MonthlyZodiac with description, etc.
 */

@Service
public class DateCalculator {

    private static Map<Integer, List<MonthlyZodiacModel>> monthMap = new HashMap<>();

    @Autowired
    private ZodiacRepository zodiacRepository;


    /**
     * Before calling findZodiaczodiac we need to populate
     * the map.
     */
    // Runs only when app starts
    @PostConstruct
    private void init(){
        populateMonthlyZodiac();
    }

        /**
         * From database,
         * Populates all zodiac zodiacs by month into hashmap
         *
         */
        public void populateMonthlyZodiac() {
            /**
             * Aries (03 21 – 04 19)
             * Taurus (04 20 – 05 20)
             * Gemini (05 21 – 06 20)
             * Cancer (06 21 – 07 22)
             * Leo (07 23 – 08 22)
             * Virgo (08 23 – 09 22)
             * Libra (09 23 – 10 22)
             * Scorpio (10 23 – 11 21)
             * Sagittarius (11 22 – 12 21)
             * Capricorn (12 22 – 01 19)
             * Aquarius (01 20 – 02 18)
             * Pisces (02 19 – 03 20)
             */

            // Database call
            List<Zodiac> zodiacList = zodiacRepository.findAll();

//            Hardcode set values for Hashmap
            List<MonthlyZodiacModel> janZodiacs = new ArrayList<>();
            monthMap.put(1, janZodiacs);

            List<MonthlyZodiacModel> febZodiacs = new ArrayList<>();
            monthMap.put(2, febZodiacs);

            ArrayList<MonthlyZodiacModel> marZodiacs = new ArrayList<>();
            monthMap.put(3, marZodiacs);

            ArrayList<MonthlyZodiacModel> aprilZodiacs = new ArrayList<>();
            monthMap.put(4, aprilZodiacs);

            ArrayList<MonthlyZodiacModel> mayZodiacs = new ArrayList<>();
            monthMap.put(5,mayZodiacs);
            ArrayList<MonthlyZodiacModel> juneZodiacs = new ArrayList<>();
            monthMap.put(6,juneZodiacs);
            ArrayList<MonthlyZodiacModel> julyZodiacs = new ArrayList<>();
            monthMap.put(7,julyZodiacs);

            ArrayList<MonthlyZodiacModel> augZodiacs = new ArrayList<>();
            monthMap.put(8,augZodiacs);

            ArrayList<MonthlyZodiacModel> septZodiacs = new ArrayList<>();
            monthMap.put(9,septZodiacs);

            ArrayList<MonthlyZodiacModel> octZodiacs = new ArrayList<>();
            monthMap.put(10,octZodiacs);
            ArrayList<MonthlyZodiacModel> novZodiacs = new ArrayList<>();
            monthMap.put(11,novZodiacs);
            ArrayList<MonthlyZodiacModel> decZodiacs = new ArrayList<>();
            monthMap.put(12,decZodiacs);




            // Write logic & Switch case
            // Repopulate monthlyzodiacmodel with database instance
            for( Zodiac zodiac : zodiacList){

                       int startDateDay = Integer.parseInt(zodiac.getStartDate().split("-")[1]); //22
                       int startDateMonth = Integer.parseInt(zodiac.getStartDate().split("-")[0]); //12

                       int endDateDay = Integer.parseInt(zodiac.getEndDate().split("-")[1]); // 19
                       int endDateMonth = Integer.parseInt(zodiac.getEndDate().split("-")[0]); //1

                       MonthlyZodiacModel zodiac1 = new MonthlyZodiacModel(1, endDateDay , endDateMonth, zodiac);
                       MonthlyZodiacModel zodiac2 = new MonthlyZodiacModel(startDateDay, 31, startDateMonth, zodiac);

                       List<MonthlyZodiacModel> zodiacList1 = monthMap.get(startDateMonth);
                       zodiacList1.add(zodiac1);
                       List<MonthlyZodiacModel> zodiacList2 = monthMap.get(endDateMonth);
                       zodiacList2.add(zodiac2);

                        monthMap.put(startDateMonth, zodiacList1);
                        monthMap.put(endDateMonth, zodiacList2);


            }


            System.out.println(monthMap);
            /**
             * Aries (03 21 – 04 19)
             * Taurus (04 20 – 05 20)
             * Gemini (05 21 – 06 20)
             * Cancer (06 21 – 07 22)
             * Leo (07 23 – 08 22)
             * Virgo (08 23 – 09 22)
             * Libra (09 23 – 10 22)
             * Scorpio (10 23 – 11 21)
             * Sagittarius (11 22 – 12 21)
             * Capricorn (12 22 – 01 19)
             * Aquarius (01 20 – 02 18)
             * Pisces (02 19 – 03 20)
             */


        } // corrected error.



        /***
         * Takes in a User's Month value and User's Day value
         * Matches the correct zodiac zodiac using the monthmap
         * returns a zodiac object
         * @param
         */

        public static Zodiac findZodiacSign(int month, int day) throws ZodiacNotFoundException{

            // CHECKS
            // month should be 1-12
            // day should be 1-31

            if(  !(month >= 1 && month <= 12)){
                System.out.println("Error!");
                throw new ZodiacNotFoundException("Invalid Month, Zodiac not found!");
            }
            if( !(day >= 1 && day <= 31)){
                System.out.println("Error");
                throw new ZodiacNotFoundException("Invalid Month, Zodiac not found!");
            }


            // 1. Check for entries that start with user's month
            List<MonthlyZodiacModel> monthZodiacs =  monthMap.get(month);
            System.out.println(monthZodiacs.size());


            // 2. Iterate through list of MonthlyZodiac

            // GIVEN 07/19 -> Cancer season spans 06-23 < 19 && 07 -22 > 19, Program returns Leo
            // GIVEN  08 22 -> Leo season spans 07-23 > 22 && 08-22 == 22, Program returns Virgo

            for( MonthlyZodiacModel thisZodiac : monthZodiacs){
                // Check the day against startday and endday
                 if(day >= thisZodiac.startDay && day <= thisZodiac.endDay) {

                        return thisZodiac.getZodiac();
                }
            }

            return null;
        }






}
