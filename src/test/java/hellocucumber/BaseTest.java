package hellocucumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.CucumberOptions;
import hellocucumber.config.PropertyHolder;

@ContextConfiguration("/cucumber.xml")
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class BaseTest {

    @Autowired
    protected PropertyHolder propertyHolder;

}