package com.zodiac.Zodiac.Service;
import com.zodiac.Zodiac.Entity.Zodiac;
import com.zodiac.Zodiac.Model.MonthlyZodiacModel;
import jakarta.annotation.PostConstruct;
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

    public static Map<Integer, List<MonthlyZodiacModel>> monthMap = new HashMap<>();

    /**
     * Before calling findZodiacSign we need to populate
     * the map.
     */
    @PostConstruct
    public void init(){
        populateMonthlyZodiac();
    }

        /**
         * From database,
         * Populates all zodiac signs by month into hashmap
         *
         */
        public static final void populateMonthlyZodiac() {
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

            // 1 -  JANUARY Month Zodicas

            // ********************************************  1 Capricorn ****************************************************//
            // Capricorn : 1-01 - 1-19


            Zodiac capricornSecondHalf = new Zodiac();
            capricornSecondHalf.setStartDate("12-22");
            capricornSecondHalf.setEndDate("1-19");
            capricornSecondHalf.setDescription("Ruled by Saturn, Capricorns are ambitious and determined initiators. If commanding a room with their authoritative presence alone isn’t Capricorn’s biggest strength, their self-discipline just might be. They comfortably and successfully know how to delegate to others and with the vision to lead.");
            capricornSecondHalf.setElemental("Earth");
            capricornSecondHalf.setName("Capricorn");
            // ********************************************  1 JANUARY ****************************************************//

            MonthlyZodiacModel janZodiac1 = new MonthlyZodiacModel(1,19 , 1, capricornSecondHalf);
            ArrayList<MonthlyZodiacModel> janZodiacs = new ArrayList<>();
            janZodiacs.add(janZodiac1);
            monthMap.put(janZodiac1.month, janZodiacs);



            // ******************************************** 1 Aquarius ****************************************************//


            // Aquarius : 01 - 20 - 01-31
            Zodiac aquariusFirstHalf = new Zodiac();
            aquariusFirstHalf.setName("Aquarius");
            aquariusFirstHalf.setElemental("Air");
            aquariusFirstHalf.setStartDate("1-20");
            aquariusFirstHalf.setEndDate("2-18");
            aquariusFirstHalf.setDescription("Independent and enigmatical, Aquarians are unique. There is no one quite like an Aquarius, and because each is so incredibly individual, it can be tough to describe them as a group. Aquarians don't like labels, and may shy away from any adjective—even the good ones you might bestow upon them. Aquarians believe in the nature of change and evolution");

            MonthlyZodiacModel janZodiac2 = new MonthlyZodiacModel(20, 31,1, aquariusFirstHalf);
            // *** Place in hashmap
            janZodiacs.add(janZodiac2);
            monthMap.put(janZodiac2.month, janZodiacs);
//
//
//

            // ********************************************  2 FEBRUARY  ****************************************************//

            //    Aquarius 2-1 - 18

            Zodiac aquariusSecondHalf = new Zodiac();
            aquariusSecondHalf.setName("Aquarius");
            aquariusSecondHalf.setStartDate("01-20");
            aquariusSecondHalf.setEndDate("2-18");
            aquariusSecondHalf.setDescription("Independent and enigmatical, Aquarians are unique. There is no one quite like an Aquarius, and because each is so incredibly individual, it can be tough to describe them as a group. Aquarians don't like labels, and may shy away from any adjective—even the good ones you might bestow upon them. Aquarians believe in the nature of change and evolution");
            aquariusSecondHalf.setElemental("Air");
            MonthlyZodiacModel febZodiac1 = new MonthlyZodiacModel(1, 18, 2, aquariusSecondHalf);

//        // ******************************************** 2- Pisces ****************************************************//

            // Pisces 2-19 - 29

            Zodiac piscesFirstHalf = new Zodiac();
            piscesFirstHalf.setElemental("Water");
            piscesFirstHalf.setName("Pisces");
            piscesFirstHalf.setStartDate("2-19");
            piscesFirstHalf.setDescription("");
            piscesFirstHalf.setEndDate("3-20");
            MonthlyZodiacModel febZodiac2 = new MonthlyZodiacModel(19, 29, 2, piscesFirstHalf);

//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> febZodiacs = new ArrayList<>();
            febZodiacs.add(febZodiac1);
            febZodiacs.add(febZodiac2);
            monthMap.put(febZodiac1.month, febZodiacs);

            // ********************************************  3 March  ****************************************************//


//        // ******************************************** Pisces ****************************************************//

            // Pisces 03 01- 20

            Zodiac piscesSecondHalf = new Zodiac();
            MonthlyZodiacModel marZodiac1 = new MonthlyZodiacModel(1,20,03,piscesSecondHalf);
            piscesSecondHalf.setName("Pisces");
            piscesSecondHalf.setElemental("Water");
            piscesSecondHalf.setStartDate("2-19");
            piscesSecondHalf.setEndDate("3-20");
            // ******************************************** Aries ****************************************************//

            // Aries 03 21 - 31

            Zodiac ariesFirstHalf = new Zodiac();
            ariesFirstHalf.setElemental("Fire");
            ariesFirstHalf.setName("Aries");
            ariesFirstHalf.setStartDate("3-21");
            ariesFirstHalf.setEndDate("4-19");
            ariesFirstHalf.setDescription("Aries's masculine nature is forthright with vigor, a trait further amplified by its planetary ruler, Mars. Aries is known to be vivacious, enthusiastic, childish, and a bit selfish. Although this sign is impulsive and hotheaded, nobody can deny the quick-thinking and intense call-to-action innate in any Aries. Expressed as the Ram, Aries can be counted on to headbutt its way through anything!\n");

            MonthlyZodiacModel marZodiac2 = new MonthlyZodiacModel(21,31, 03, ariesFirstHalf);
//
//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> marZodiacs = new ArrayList<>();
            marZodiacs.add(marZodiac1);
            marZodiacs.add(marZodiac2);
            monthMap.put(3, marZodiacs);

            // ********************************************  4 APRIL  ****************************************************//


//        // ******************************************** Aries ****************************************************//

            // Aries 04 -01 , 04-19

            Zodiac ariesSecondHalf = new Zodiac();
            MonthlyZodiacModel aprilZodiac1 = new MonthlyZodiacModel(1,19,04,ariesSecondHalf);

            ariesSecondHalf.setElemental("Fire");
            ariesSecondHalf.setName("Aries");
            ariesSecondHalf.setStartDate("3-21");
            ariesSecondHalf.setEndDate("4-19");
            ariesSecondHalf.setDescription("Aries's masculine nature is forthright with vigor, a trait further amplified by its planetary ruler, Mars. Aries is known to be vivacious, enthusiastic, childish, and a bit selfish. Although this sign is impulsive and hotheaded, nobody can deny the quick-thinking and intense call-to-action innate in any Aries. Expressed as the Ram, Aries can be counted on to headbutt its way through anything!\n");



            // ******************************************** Taurus ****************************************************//

            // Taurus 04-20 , 04-30
            Zodiac taurusFirstHalf = new Zodiac();
            taurusFirstHalf.setName("Taurus");
            taurusFirstHalf.setElemental("Earth");
            taurusFirstHalf.setStartDate("4-20");
            taurusFirstHalf.setEndDate("5-20");
            taurusFirstHalf.setDescription("Smart, ambitious, and trustworthy, Taurus is the anchor of the Zodiac. Amazing friends, colleagues, and partners, Taureans value honesty above all else and are proud that their personal relationships tend to be drama free. Bulls get the reputation of being stubborn, but they're not always stuck in their ways");

            MonthlyZodiacModel aprilZodiac2 = new MonthlyZodiacModel(20, 30, 4, taurusFirstHalf);

//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> aprilZodiacs = new ArrayList<>();
            aprilZodiacs.add(aprilZodiac1);
            aprilZodiacs.add(aprilZodiac2);
            monthMap.put(aprilZodiac1.month, aprilZodiacs);


            // ********************************************  5 MAY  ****************************************************//

//        // ******************************************** Taurus ****************************************************//
            // Taurus 05 -01, 05,20

            Zodiac taurusSecondHalf = new Zodiac();
            taurusSecondHalf.setName("Taurus");
            taurusSecondHalf.setElemental("Earth");
            taurusSecondHalf.setStartDate("4-20");
            taurusSecondHalf.setEndDate("5-20");
            taurusSecondHalf.setDescription("Smart, ambitious, and trustworthy, Taurus is the anchor of the Zodiac. Amazing friends, colleagues, and partners, Taureans value honesty above all else and are proud that their personal relationships tend to be drama free. Bulls get the reputation of being stubborn, but they're not always stuck in their ways");

            MonthlyZodiacModel mayZodiac1 = new MonthlyZodiacModel(1,20,05,taurusSecondHalf);
//        // ******************************************** Gemini ****************************************************//

            //  Gemini 05 -21, 05-31

            Zodiac geminiFirstHalf = new Zodiac();
            geminiFirstHalf.setName("Gemini");
            geminiFirstHalf.setElemental("Air");
            geminiFirstHalf.setStartDate("5-21");
            geminiFirstHalf.setEndDate("6-20");
            geminiFirstHalf.setDescription("Gemini is an air sign with a ton of superpowers, including multitasking, since they’re multifaceted and live outside of the box. Recognized as the sacred duality present in the universe, Gemini is an intellectual and versatile sign with an endless curiosity and a bright, quick-witted mind.");


            MonthlyZodiacModel mayZodiac2 = new MonthlyZodiacModel(21, 31, 5, geminiFirstHalf);

//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> mayZodiacs = new ArrayList<>();
            mayZodiacs.add(mayZodiac1);
            mayZodiacs.add(mayZodiac2);
            monthMap.put(mayZodiac1.month, mayZodiacs);

            // ********************************************  6 JUNE  ****************************************************//

            // ******************************************** Gemini ****************************************************//


            // Gemini 06 - 01, 06-20
            // Cancer 06-21, 06-30

            Zodiac geminiSecondHalf = new Zodiac();
            geminiSecondHalf.setName("Gemini");
            geminiSecondHalf.setElemental("Air");
            geminiSecondHalf.setStartDate("5-21");
            geminiSecondHalf.setEndDate("6-20");
            geminiSecondHalf.setDescription("Gemini is an air sign with a ton of superpowers, including multitasking, since they’re multifaceted and live outside of the box. Recognized as the sacred duality present in the universe, Gemini is an intellectual and versatile sign with an endless curiosity and a bright, quick-witted mind.");

            MonthlyZodiacModel juneZodiac1 = new MonthlyZodiacModel(1,20,6, geminiSecondHalf);

//        // ******************************************** Cancer ****************************************************//

            Zodiac cancerFirstHalf = new Zodiac();
            cancerFirstHalf.setName("Cancer");
            cancerFirstHalf.setElemental("Water");
            cancerFirstHalf.setStartDate("6-21");
            cancerFirstHalf.setEndDate("7-22");
            cancerFirstHalf.setDescription("One of Cancer’s strongest assets is their capacity for love—and the lengths they’ll go to for the people they care about. Intuitive and tenacious, this sign sticks to their roots and excels at getting what it wants to protect their family and loved ones,a Cancer sign will give you the world, as long as you give it right back.");

            MonthlyZodiacModel juneZodiac2 = new MonthlyZodiacModel(21, 30, 6, cancerFirstHalf);

//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> juneZodiacs = new ArrayList<>();
            juneZodiacs.add(juneZodiac1);
            juneZodiacs.add(juneZodiac2);
            monthMap.put(juneZodiac1.month, juneZodiacs);

            // ********************************************  7 JULY  ****************************************************//


//        // ******************************************** Cancer ****************************************************//
            // Cancer 07-01 - 07-22

            Zodiac cancerSecondHalf = new Zodiac();
            cancerSecondHalf.setName("Cancer");
            cancerSecondHalf.setElemental("Water");
            cancerSecondHalf.setStartDate("6-21");
            cancerSecondHalf.setEndDate("7-22");
            cancerFirstHalf.setDescription("One of Cancer’s strongest assets is their capacity for love—and the lengths they’ll go to for the people they care about. Intuitive and tenacious, this sign sticks to their roots and excels at getting what it wants to protect their family and loved ones,a Cancer sign will give you the world, as long as you give it right back.");

            MonthlyZodiacModel julyZodiac1 = new MonthlyZodiacModel(1,22,7,cancerSecondHalf);

//        // ******************************************** Leo ****************************************************//
            // Leo 07-23, 07-31

            Zodiac leoFirstHalf = new Zodiac();
            leoFirstHalf.setName("Leo");
            leoFirstHalf.setElemental("Fire");
            leoFirstHalf.setStartDate("7-23");
            leoFirstHalf.setEndDate("8-22");
            leoFirstHalf.setDescription("This king of the jungle has a lust for life. Leo can be bold and fearless, allowing them to take risks and pursue their dreams with vigor. If you know a Leo, then you probably also know that making a good impression is their number one priority. This sign’s creativity and fiery magnetism puts them at the center stage of life.");

            MonthlyZodiacModel julyZodiac2 = new MonthlyZodiacModel(23,31, 7, leoFirstHalf);

//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> julyZodiacs = new ArrayList<>();
            julyZodiacs.add(julyZodiac1);
            julyZodiacs.add(julyZodiac2);
            monthMap.put(julyZodiac1.month, julyZodiacs);


            // ********************************************  8 AUGUST  ****************************************************//

//        // ******************************************** Leo ****************************************************//

            // Leo 08-01, 08-22

            Zodiac leoSecondHalf = new Zodiac();
            leoSecondHalf.setName("Leo");
            leoSecondHalf.setElemental("Fire");
            leoSecondHalf.setStartDate("7-23");
            leoSecondHalf.setEndDate("8-22");
            leoSecondHalf.setDescription("This king of the jungle has a lust for life. Leo can be bold and fearless, allowing them to take risks and pursue their dreams with vigor. If you know a Leo, then you probably also know that making a good impression is their number one priority. This sign’s creativity and fiery magnetism puts them at the center stage of life.");

            MonthlyZodiacModel augZodiac1 = new MonthlyZodiacModel(1,22, 8, leoSecondHalf);

//        // ******************************************** Virgo ****************************************************//

            // Virgo 08-23, 08 -31

            Zodiac virgoFirstHalf = new Zodiac();
            virgoFirstHalf.setName("Virgo");
            virgoFirstHalf.setElemental("Earth");
            virgoFirstHalf.setStartDate("8-23");
            virgoFirstHalf.setEndDate("9-22");
            virgoFirstHalf.setDescription("Virgo is capable of taking on high levels of responsibility, which fills them with a great sense of duty in the world. They’re used to wearing multiple hats at the same time and are often under the impression that they’re the best person to do it all.");

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


            MonthlyZodiacModel augZodiac2 = new MonthlyZodiacModel(23, 31, 8, virgoFirstHalf);

//        // *** Place in hashmap
            ArrayList<MonthlyZodiacModel> augustZodiacs = new ArrayList<>();
            augustZodiacs.add(augZodiac1);
            augustZodiacs.add(augZodiac2);
            monthMap.put(augZodiac1.month, augustZodiacs);

            // ********************************************  9 SEPTEMBER  ****************************************************//


//        // ******************************************** Virgo ****************************************************//

            // Virgo 09- 01 - 09-22

            Zodiac virgoSecondHalf = new Zodiac();
            virgoSecondHalf.setName("Virgo");
            virgoSecondHalf.setElemental("Earth");
            virgoSecondHalf.setStartDate("8-23");
            virgoSecondHalf.setEndDate("9-22");
            virgoSecondHalf.setDescription("Virgo is capable of taking on high levels of responsibility, which fills them with a great sense of duty in the world. They’re used to wearing multiple hats at the same time and are often under the impression that they’re the best person to do it all.");

            MonthlyZodiacModel septZodiac1 = new MonthlyZodiacModel(1, 22, 9, virgoSecondHalf);

            // ******************************************** Libra ****************************************************//
            // Libra 09-23, 09-30

            Zodiac libraFirstHalf = new Zodiac();
            libraFirstHalf.setName("Libra");
            libraFirstHalf.setElemental("Air");
            libraFirstHalf.setStartDate("9-23");
            libraFirstHalf.setEndDate("10-22");
            libraFirstHalf.setDescription("Libras are experts at keeping the peace (they are represented by the scales of justice, after all), but there’s nothing stronger than Libra’s congeniality. This sign seeks to be a source of joy for others. They’re basically the epitome of beauty, balance, harmony, and a sense of fair play");

            MonthlyZodiacModel septZodiac2 = new MonthlyZodiacModel(23, 30, 9, libraFirstHalf);

            ArrayList<MonthlyZodiacModel> septZodiacs = new ArrayList<>();
            septZodiacs.add(septZodiac1);
            septZodiacs.add(septZodiac2);
            monthMap.put(septZodiac1.month, septZodiacs);

            // ********************************************  10 OCTOBER  ****************************************************//


            // ******************************************** Libra ****************************************************//

            // Libra 10-01, 10-22
            Zodiac libraSecondHalf = new Zodiac();
            libraSecondHalf.setName("Libra");
            libraSecondHalf.setElemental("Air");
            libraSecondHalf.setStartDate("9-23");
            libraSecondHalf.setEndDate("10-22");
            libraSecondHalf.setDescription("Libras are experts at keeping the peace (they are represented by the scales of justice, after all), but there’s nothing stronger than Libra’s congeniality. This sign seeks to be a source of joy for others. They’re basically the epitome of beauty, balance, harmony, and a sense of fair play");


            MonthlyZodiacModel octZodiac1 = new MonthlyZodiacModel(1, 22, 10, libraSecondHalf);

//        // ******************************************** Scorpio ****************************************************//

            // Scorpio 10-23, 10-31
            Zodiac scorpioFirstHalf = new Zodiac();
            scorpioFirstHalf.setName("Scorpio");
            scorpioFirstHalf.setElemental("Water");
            scorpioFirstHalf.setStartDate("10-23");
            scorpioFirstHalf.setEndDate("11-21");
            scorpioFirstHalf.setDescription("Scorpio knows how to trigger other people and push their buttons behind limits. Yet, they also love hard, so you can expect a Scorpio to fight till the end for the people they care about. As a fixed modality, they tend to be determined and stable, which also makes Scorpios super independent.");


            MonthlyZodiacModel octZodiac2 = new MonthlyZodiacModel(23, 31, 10, scorpioFirstHalf);

            ArrayList<MonthlyZodiacModel> octZodiacs = new ArrayList<>();
            octZodiacs.add(octZodiac1);
            octZodiacs.add(octZodiac2);
            monthMap.put(octZodiac1.month, octZodiacs);


            // ********************************************  11 November  ****************************************************//


            // ******************************************** Scorpio ****************************************************//
            // Scorpio 11-01, 11-21

            Zodiac scorpioSecondHalf = new Zodiac();
            scorpioSecondHalf.setName("Scorpio");
            scorpioSecondHalf.setElemental("Water");
            scorpioSecondHalf.setStartDate("10-23");
            scorpioSecondHalf.setEndDate("11-21");
            scorpioSecondHalf.setDescription("Scorpio knows how to trigger other people and push their buttons behind limits. Yet, they also love hard, so you can expect a Scorpio to fight till the end for the people they care about. As a fixed modality, they tend to be determined and stable, which also makes Scorpios super independent.");


            MonthlyZodiacModel novZodiac1 = new MonthlyZodiacModel(1, 21, 11, scorpioSecondHalf);

//        // ******************************************** Sagitarrius ****************************************************//
            // Sagitarrius 11-22. 11-31
            Zodiac sagFirstHalf = new Zodiac();
            sagFirstHalf.setName("Sagittarius");
            sagFirstHalf.setElemental("Fire");
            sagFirstHalf.setDescription("These thrill-seekers rely on their luck and natural positivity to move them from one adventure to the next because they’re so focused on seeing the benefits of exploring new places and trying new experiences. They’re also truth-seekers, and the best way for them to get answers is to seek out tons of connections with others");
            sagFirstHalf.setStartDate("11-22");
            sagFirstHalf.setEndDate("12-21");



            MonthlyZodiacModel novZodiac2 = new MonthlyZodiacModel(22, 31, 11, sagFirstHalf);

            ArrayList<MonthlyZodiacModel> novZodiacs = new ArrayList<>();
            novZodiacs.add(novZodiac1);
            novZodiacs.add(novZodiac2);
            monthMap.put(novZodiac1.month, novZodiacs);

            // ********************************************  12 December  ****************************************************//

            // ******************************************** Sagitarrius ****************************************************//
            // Sagitarrius 12-01, 12-21
            Zodiac sagSecondHalf = new Zodiac();
            sagSecondHalf.setName("Sagittarius");
            sagSecondHalf.setElemental("Fire");
            sagSecondHalf.setDescription("These thrill-seekers rely on their luck and natural positivity to move them from one adventure to the next because they’re so focused on seeing the benefits of exploring new places and trying new experiences. They’re also truth-seekers, and the best way for them to get answers is to seek out tons of connections with others");
            sagSecondHalf.setStartDate("11-22");
            sagSecondHalf.setEndDate("12-21");

            MonthlyZodiacModel decZodiac1 = new MonthlyZodiacModel(1, 21, 12, sagSecondHalf);

//        // ******************************************** Capricorn ****************************************************//
            // Capricorn 12-22, 12-31
            Zodiac capFirstHalf = new Zodiac();
            MonthlyZodiacModel decZodiac2 = new MonthlyZodiacModel(22, 31, 12, capFirstHalf);

            capFirstHalf.setName("Capricorn");
            capFirstHalf.setElemental("Earth");
            capFirstHalf.setDescription("Ruled by Saturn, Capricorns are ambitious and determined initiators. If commanding a room with their authoritative presence alone isn’t Capricorn’s biggest strength, their self-discipline just might be. They comfortably and successfully know how to delegate to others and with the vision to lead.");
            capFirstHalf.setStartDate("12-22");
            capFirstHalf.setEndDate("1-19");
            ArrayList<MonthlyZodiacModel> decZodiacs = new ArrayList<>();
            decZodiacs.add(decZodiac2);
            decZodiacs.add(decZodiac1);
            monthMap.put(decZodiac1.month, decZodiacs);

            // ********************************************  Print map  ****************************************************//


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


        }


        /**
         * Program starts -> fetch from database  -> populate hashmap -> user request enters -> hashmap fetched
         */

        /***
         * Takes in a User's Month value and User's Day value
         * Matches the correct zodiac sign using the monthmap
         * returns a zodiac object
         * @param
         */

        public static Zodiac findZodiacSign(int month, int day){

            // CHECKS
            // month should be 1-12
            // day should be 1-31

            if(  !(month >= 1 && month <= 12)){
                System.out.println("Invalid month!");
                return null;
            }
            if( !(day >= 1 && day <= 31)){
                System.out.println("Invalid day");
                return null;
            }


            // 1. Check for entries that start with user's month
            List<MonthlyZodiacModel> monthZodiacs =  monthMap.get(month);
            System.out.println(monthZodiacs.size());

            // example 12-28
            // capricorn 12 -22 --> 12-31
            // Sagitarrius 12-01 --> 12-21
            // 2. Iterate through list of MonthlyZodiac

            // TODO: Access the zodiac part within the loop
            for( MonthlyZodiacModel thisZodiac : monthZodiacs){
                // Check the day against startday and endday
                if(day >= thisZodiac.startDay && day <= thisZodiac.endDay ){
                    return thisZodiac.getZodiac();
                }
            }

            return null;
        }






}
