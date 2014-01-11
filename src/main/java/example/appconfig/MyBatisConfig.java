package example.appconfig;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("example.persistence")
public class MyBatisConfig {

    /** Whatever {@link DataSource} bean that was created in the DataSourceConfig file */
    @Autowired
    DataSource dataSource;

    /**
     * The {@link SqlSessionFactory} is the core MyBatis class which manages communication with the
     * database.
     * 
     * @return a {@link SqlSessionFactory} configured to use the provided {@link DataSource}.
     * @throws Exception when shit goes down
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }

}
