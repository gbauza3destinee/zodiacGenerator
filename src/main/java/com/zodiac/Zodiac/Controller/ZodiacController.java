package com.zodiac.Zodiac.Controller;
import com.zodiac.Zodiac.Entity.Zodiac;
import com.zodiac.Zodiac.Exception.ZodiacNotFoundException;
import com.zodiac.Zodiac.Repository.ZodiacRepository;
import com.zodiac.Zodiac.Service.DateCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


// Clarify the transaction happening here-- are we checking DB or
// doing datecalculator.findZodiacSign and then using name to check repo?
@RestController
public class ZodiacController {


    @Autowired
    ZodiacRepository zodiacRepository;
    @Autowired
    private DateCalculator dateCalculator;

    /**
     * A User will request a get call to retrieve their zodiac sign and provide user input
     * as int month and int day.
     */

    @GetMapping("/zodiac")
    public ResponseEntity<Zodiac> findZodiacByDate(@RequestParam("month") int month, @RequestParam("day") int day)
    {
        Zodiac zodiac = dateCalculator.findZodiacSign(month, day);

        if(Objects.isNull(zodiac)){
            throw new ZodiacNotFoundException("Zodiac could not be found");
        }

        return ResponseEntity.ok(zodiac);
    }

    @GetMapping("/zodiac/{name}")
    public ResponseEntity<Zodiac> findZodiacByName(@PathVariable("name") String name){
        Zodiac zodiac = zodiacRepository.findByName(name);
        return ResponseEntity.ok(zodiac);
    }



}
