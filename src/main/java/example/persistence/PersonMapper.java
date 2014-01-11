package example.persistence;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import example.domain.Person;

public interface PersonMapper extends MyMapper {

    public Person getByFirstName(@Param("firstname") String firstname);
}
