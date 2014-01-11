package example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.domain.Person;
import example.persistence.PersonMapper;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person getByFirstName(final String firstname) {
        return personMapper.getByFirstName(firstname);
    }
}
