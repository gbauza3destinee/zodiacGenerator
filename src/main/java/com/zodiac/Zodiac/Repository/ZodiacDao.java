package com.zodiac.Zodiac.Repository;
import com.zodiac.Zodiac.Entity.Zodiac;
import org.springframework.beans.factory.annotation.Autowired;

public class ZodiacDao {

    @Autowired
    ZodiacRepository zodiacRepository;

    public ZodiacDao(){

    }

    public Zodiac findByName(String name){
      Zodiac zodiacDb = zodiacRepository.findByName(name);
      return zodiacDb;
    }


}
