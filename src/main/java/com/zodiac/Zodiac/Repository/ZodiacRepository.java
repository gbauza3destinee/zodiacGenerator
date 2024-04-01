package com.zodiac.Zodiac.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zodiac.Zodiac.Entity.Zodiac;
import org.springframework.stereotype.Repository;

@Repository
public interface ZodiacRepository extends JpaRepository<Zodiac, String> {

    Zodiac findByName(String name);

}
