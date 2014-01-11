package example.services;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.appconfig.DataSourceConfig;
import example.appconfig.MyBatisConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DataSourceConfig.class, MyBatisConfig.class })
public abstract class AbstractServiceTest {

    // nothing yet... so far we're just registering the beans we scan for
}
