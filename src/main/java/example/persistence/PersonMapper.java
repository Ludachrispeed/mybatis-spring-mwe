package example.persistence;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import example.domain.Person;

public interface PersonMapper {

//    @Select("select * from PEOPLE where PEOPLE.FIRSTNAME = #{firstname}")
    public Person getByFirstName(@Param("firstname") String firstname);
}
