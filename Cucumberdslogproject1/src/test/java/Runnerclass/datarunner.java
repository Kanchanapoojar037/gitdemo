package Runnerclass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/datafeature",
               glue= {"datastep","applicationhookd"},
               monochrome=true,plugin= {"pretty"})
public class datarunner {

}
