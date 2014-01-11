package example.services;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import example.domain.Person;
import example.services.PersonService;

@ContextConfiguration
public class PersonServiceTest extends AbstractServiceTest {

    @Configuration
    @ComponentScan(basePackageClasses = PersonService.class)
    static class LocalConfig {
        // nothing to declare - we get all the beans we need through component scanning
    }

    @Autowired
    PersonService personService;

    @Test
    public void testService() {
        final Person person = personService.getByFirstName("scooby");
        System.out.println(person);
    }
}
