
//******* to Run ALL the Project***************

package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (
        features =  "src/main/resources/features" ,
        glue = "StepDefinations" ,
        tags  = "@regressionTest",
        plugin =
                {
                "pretty",
               "html:target/cucumber-reports/cucumber-pretty.html",
                        "html:target/cucumber-reports/cucumber.html",
               "json:target/cucumber-reports/cucumber-TestReport.json",
               "rerun:target/cucumber-reports/rerun.txt",
               "junit:target/cukes.xml"


                }

)


public class ProjectRunner extends AbstractTestNGCucumberTests
{


}
