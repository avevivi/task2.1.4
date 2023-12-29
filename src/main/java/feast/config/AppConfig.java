package feast.config;

import feast.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "feast")
public class AppConfig {

    @Bean
    public static Duck2 getDuck(@Qualifier("chicken3") Chicken3 chicken) {
        return new Duck2(chicken);
    }

    @Bean
    public static Chicken3 getChicken(@Qualifier("pig4") Pig4 pig) {
        return new Chicken3(pig);
    }

    @Bean
    public static Pig4 getPig(@Qualifier("lamb5") Lamb5 lamb) {
        return new Pig4(lamb);
    }

    @Bean
    public static Lamb5 getLamb(@Qualifier("goat6") Goat6 goat) {
        return new Lamb5(goat);
    }

    @Bean
    public static Goat6 getGoat(@Qualifier("horse7") Horse7 horse) {
        return new Goat6(horse);
    }

    @Bean
    public static Horse7 getHorse(@Qualifier("camel8") Camel8 camel) {
        return new Horse7(camel);
    }
}
