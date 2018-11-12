package com.example.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.example.community.CommunityApplication.class)
public class CommunityApplicationTests {

    @Value("${property.test.name}")
    private String propertyTestName;

    @Value("${propertyTest}")
    private String propertyTest;

    @Value("#{'${propertyTestList}'.split(',')}")
    private List<String> propertyTestList;

    @Test
    public void testValue() {
        assertThat(propertyTestName, is("property depth test"));
        assertThat(propertyTest, is("test"));
        assertThat(propertyTestList.get(0), is("a"));
    }

}
