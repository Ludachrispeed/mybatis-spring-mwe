package com.ludachrispeed.services;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ludachrispeed.appconfig.DataSourceConfig;
import com.ludachrispeed.appconfig.MyBatisConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DataSourceConfig.class, MyBatisConfig.class })
public abstract class AbstractServiceTest {

    // nothing yet... so far we're just registering the beans we scan for
}
