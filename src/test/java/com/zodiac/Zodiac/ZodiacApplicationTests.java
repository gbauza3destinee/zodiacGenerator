package com.zodiac.Zodiac;

import com.zodiac.Zodiac.Entity.Zodiac;
import com.zodiac.Zodiac.Exception.ZodiacNotFoundException;
import com.zodiac.Zodiac.Service.DateCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.mockito.Mockito.when;

@SpringBootTest
class ZodiacApplicationTests {

	@Autowired
	DateCalculator dateCalculator;
	@Test
	void contextLoads() {
	}

	//***************************** Testing Date Calculator
	// Happy Case
	public void getZodiacSign_validMonthAndDay_returnsZodiac(){
		int month = 3;
		int day = 23;
		Zodiac zodiac = new Zodiac();
		zodiac.setName("Aries");
		when(dateCalculator.findZodiacSign(month, day)).thenReturn(zodiac);
	}

	// Edge Case
	public void getZodiacSign_invalidMonthAndDay_throwsZodiac(){
		int month = 13;
		int day = 23;

		when(dateCalculator.findZodiacSign(month, day)).thenThrow(new ZodiacNotFoundException("Zodiac not found!"));
	}




}
