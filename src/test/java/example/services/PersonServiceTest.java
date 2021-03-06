package example.services;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.appconfig.DataSourceConfig;
import example.appconfig.MyBatisConfig;
import example.domain.Person;
import example.services.PersonService;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonServiceTest {

    @Configuration
    @ComponentScan(basePackageClasses = PersonService.class)
    @Import({DataSourceConfig.class, MyBatisConfig.class})
    static class LocalConfig {
        // nothing to declare - we get all the beans we need through component scanning
    }

    @Autowired
    PersonService personService;

    @Test
    public void testService() {
        final Person person = personService.getByFirstName("scooby");
        assertEquals("scooby", person.getFirstname());
        assertEquals("doo", person.getLastname());
        System.out.println(person);
    }
}
