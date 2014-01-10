package com.ludachrispeed.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludachrispeed.domain.Person;
import com.ludachrispeed.persistence.PersonMapper;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person getByFirstName(final String firstname) {
        return personMapper.getByFirstName(firstname);
    }
}
