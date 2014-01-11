MyBatis-Spring Minimal Working Example
======================================

Has one service, "PeopleService". Uses an in-memory HSQLDB to set up a single
tabel "People" and insert two people in it.

MapperScan bug?
---------------

1. Run `PersonServiceTest`. It passes.

2. Comment out the annotations in `PersonMapper.java`, and add the following
file called `PersonMapper.xml` to
src/main/resources/example/persistence/PersonMapper.xml:

```
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="example.persistence.PersonMapper">
    <select id="getByFirstName" parameterType="string" resultType="Person">
        select * from PEOPLE where PEOPLE.FIRSTNAME = #{firstname}
    </select>

</mapper>
````

3. Rerun PersonServiceTest. It fails.