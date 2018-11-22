package com.ha.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;


/**
 * Created by eguns on 2018. 11. 20..
 */

@RunWith(SpringRunner.class)
//@JdbcTest
//@AutoConfigureTestDatabase
@SpringBootTest(classes = DataSourceTest.class)
@TestPropertySource(locations = "classpath:application.properties")
public class DataSourceTest {
    @MockBean
    private DataSourceProperties dataSource;


    @Autowired
    protected WebApplicationContext wac;



    @Test
    public void testWebApplicationContextBean() {
        System.out.println(wac == null);
        Assert.isNull(wac,"wac is null");
    }

    @Test
    public void testDataSourceBean() {
        System.out.println(dataSource == null);
        Assert.isNull(dataSource,"dataSource is null");
    }

//    @Test
//    public void testConnection() throws Exception {
//        try(Connection con = dataSource.getConnection()) {
//            Assert.isNull(con,"con is null");
//            System.out.println(con);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
